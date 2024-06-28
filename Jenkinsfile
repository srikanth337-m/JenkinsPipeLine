pipeline {
    agent any
    
    environment {
        PATH ="C:\\Windows\\System32"
        
    }

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M2_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/srikanth337-m/JenkinsPipeline.git'

              
                bat "mvn clean package -Dmaven.test.failure.ignore=truee"
            }

           
        }
         stage('Test') {
            steps {
                bat "mvn test"
            }

           
        }
    }
    
     post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                    emailext body: 'Executed the Build and It is successful', subject: 'Build is Successful', to: 'srikanth.mattigunta337@gmail.com'
                }
                 failure {
                   
                    emailext body: 'Executed the Build But It is NOT successful', subject: 'Build is NOT Successful', to: 'srikanth.mattigunta337@gmail.com'
                }
            }
}
