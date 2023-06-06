pipeline {
    agent {
        label 'demoAgent'
    }

    stages {
        stage('Selenium Test') {
            steps {
                git branch: 'main', url: 'https://github.com/shj718/Selenium-maven-project.git'
                sh 'mvn clean test'
                sh 'echo "Selenium Testing..."'
            }
        }
    }
}