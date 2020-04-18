pipeline {
  agent any
  stages {
    stage('First') {
      parallel {
        stage('First') {
          steps {
            sh 'echo "First"'
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
}