pipeline {
	agent any
	
    stages {
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Version') {
            steps {
                bat 'java -version'
            }
        }
        stage('Deliver') {
            steps {
                bat 'java -jar target/my-app-1.0-SNAPSHOT.jar'
            }
        }
    }
}
