@Library('workflowLibs@master') _

pipeline {
  agent any  
	
    stages {
      stage('First') {
        steps {
          script{
            sh(label: 'Get GIT_HASH', returnStdout: true, script: "git log -n 1 --pretty=format:'%h'").trim()
		  
            def util = new common.utils()
            echo "${util.getVersion(env.BUILD_NUMBER,env.GIT_COMMIT)}"
		  
            echo "${notify.call('Hello')}"
	    
            def loopscript = libraryResource('loop.sh')
            sh loopscript
		  
            def datajson = libraryResource('data.json')
	    echo datajson
          }
        }
      }
    }
}
