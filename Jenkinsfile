pipeline {
	agent any
	
    stages {
        stage('Version') {
            steps {
                bat 'javac -version'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deliver') {
            steps {
                bat 'java -jar target/my-app-1.0-SNAPSHOT.jar'
            }
        }
    }
}
