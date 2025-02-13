pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp target/api-0.0.1-SNAPSHOT.jar com.rest.api'
            }
        }
    }
}
