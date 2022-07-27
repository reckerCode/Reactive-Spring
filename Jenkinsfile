// CODE_CHANGE = getGitChanges()
pipeline {
    agent any
    environment{
        NEW_VERSION = '1.2.3'
        //"credentials("credentialId")" binds the credentials to your env variable
        SERVER_CREDENTIALS = credentials('server-credentials ')
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                echo "building version ${NEW_VERSION}"
            }
        }
        stage('Test') {
//         when{
//             expression{
//                 BRANCH_NAME == "dev" || BRANCH_NAME == "main"
//             }
//         }
             steps {
                echo 'Testing the application...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application....'
//                 withCredentials([
//                     usernamePassword(credentials: 'server-credentials', usernameVariable: USER, passwordVariable: PWD)
//                 ]){
//                     sh "some script &{USER} ${PWD}"
//                 }
            }
        }
    }
}