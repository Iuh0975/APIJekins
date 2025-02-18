pipeline {
    agent any

    stages {
        stage('check java version') {
            steps {
                bat 'java -version'
            }
        }
        stage('check java directory') {
            steps {
                bat 'echo $JAVA_HOME'
            }
        }
        stage('check maven version') {
            steps {
                bat 'mvn -version'
            }
        }
//         stage('Build') {
//             steps {
//                 bat 'mvn clean package'
//             }
//         }
//
//         stage('Deploy') {
//             steps {
//                 bat 'java -jar target/api-0.0.1-SNAPSHOT.jar'
//             }
//         }

    }
}