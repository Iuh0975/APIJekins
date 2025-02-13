pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
                bat 'mvn package -Dmaven.test.skip=true'
                bat 'mv target/api-0.0.1-SNAPSHOT.jar target/api.jar'
            }
        }

        stage('Deploy') {
            steps {
                bat 'java -jar target/api-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
