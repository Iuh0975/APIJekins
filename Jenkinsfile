pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Check Java Version') {
            steps {
                bat 'java -version'
            }
        }

        stage('Run') {
            steps {
                bat 'java -jar target/api-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
