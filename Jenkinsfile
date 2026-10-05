pipeline {
    agent any

    tools {
        maven 'Maven-3.9.9'
        jdk 'JDK-21'
    }

    stages {
        stage('Checkout Source') {
            steps {
                echo 'Checking out latest commit from GitHub...'
                checkout scm
            }
        }

        stage('Compile & Unit Tests') {
            steps {
                echo 'Executing Automated JUnit 5 Test Suite...'
                bat 'mvn clean test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package WAR Artifact') {
            steps {
                echo 'Packaging emergency-web-app.war...'
                bat 'mvn package -DskipTests'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                echo 'Deploying WAR to Apache Tomcat webapps...'
                bat '''
                    if exist "%WORKSPACE%\\target\\emergency-web-app.war" (
                        copy /Y "%WORKSPACE%\\target\\emergency-web-app.war" "..\\tools\\apache-tomcat-10.1.34\\webapps\\"
                        echo Deployed successfully to Tomcat!
                    )
                '''
            }
        }
    }

    post {
        success {
            echo '🎉 Pipeline Completed Successfully! Application is LIVE.'
        }
        failure {
            echo '❌ Pipeline Failed. Please inspect build console logs.'
        }
    }
}
