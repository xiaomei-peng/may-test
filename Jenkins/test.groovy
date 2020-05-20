pipeline{
    agent{label 'xiaomei'}
    stages{
        stage('test'){
            steps{
                echo "test webhook"
                echo "test sync"
             }
            }
        }
    }
