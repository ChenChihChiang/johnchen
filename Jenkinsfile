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
        slackSend(token: 'u8xTxJ0Us1FpZTroSgLctMc6', username: 'john', channel: '#clienttestingenv', message: 'hello', teamDomain: 'Grindr')
      }
    }

  }
  environment {
    phase1 = 'john'
    phase2 = 'chen'
    phase3 = 'johnchen'
  }
}