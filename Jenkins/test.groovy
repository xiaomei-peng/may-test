pipeline{
    agent{label 'xiaomei'}
    stages{
        stage('extend storage'){
            steps{
                echo "test webhook"
                echo "test"
             }
            }
        }
    }
