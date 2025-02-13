pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                bat 'java -cp target/api-0.0.1-SNAPSHOT.jar com.rest.api'
            }
        }
    }
}
