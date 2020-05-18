pipeline{
    agent{label 'xiaomei'}
    stages{
        stage('extend storage'){
            steps{
                echo "this is test"
             }
            }
        }
    }
