pipeline {
  agent any
  stages {
    stage('First') {
      parallel {
        stage('First') {
          steps {
            sh 'echo "First"'
            input 'go / not go'
          }
        }

        stage('Para') {
          steps {
            echo 'para'
          }
        }

      }
    }

    stage('Second') {
      steps {
        echo 'Second'
      }
    }

  }
  environment {
    tag = 'john'
  }
}