pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                bat 'java -jar target/api-0.0.1-SNAPSHOT.jar.original'
            }
        }
    }
}
