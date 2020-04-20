pipeline {
  agent any
  stages {
    stage('First') {
      steps {
        sh 'echo "${phase1}"'
      }
    }

    stage('wait') {
      steps {
        input 'go / not go'
      }
    }

    stage('final') {
      steps {
        sh 'echo "${phase3}"'
      }
    }

    stage('notification') {
      steps {
        slackSend(token: '123', username: 'john', channel: '#test', message: 'hello', teamDomain: '321')
      }
    }

  }
  environment {
    phase1 = 'john'
    phase2 = 'chen'
    phase3 = 'johnchen'
  }
}