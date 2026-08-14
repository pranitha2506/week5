pipeline {
    agent any

    environment {
        PATH = "C:\\Program Files\\Java\\jdk-21\\bin;${env.PATH}"
    }

    stages {

        

        stage('Compile') {
            steps {
                bat 'javac factorial.java Testfactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java Testfactorial'
            }
        }

        stage('Run') {
            steps {
                bat 'java factorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'jar cfm factorial.jar manifest.txt factorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'factorial.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build, test, run and JAR creation successful and artifact is ready!'
        }

        failure {
            echo 'Build or test failed!'
        }
    }
}