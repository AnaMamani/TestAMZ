pipeline {
  agent any

    stages {
       stage ('Build') {
         steps {
           sh './quickstart/gradlew clean assemble -p quickstart'
         }
       }
       stage ('Testing') {
         steps {
           sh './quickstart/gradlew test -p quickstart'
           junit '**/build/test-results/test/*.xml'
         }
       }
       stage ('Publish') {
         steps {
           sh './quickstart/gradlew uploadArchives -p quickstart'
           archiveArtifacts artifacts: '**/repos/*.jar'
         }
       }
       stage ('Build') {
         steps {
           sh './webApplication/gradlew clean assemble -p quickstart'
         }
       }
       stage ('Testing') {
         steps {
           sh './webApplication/gradlew test -p quickstart'
           junit '**/build/test-results/test/*.xml'
         }
       }
       stage ('Publish') {
         steps {
           sh './webApplication/gradlew uploadArchives -p quickstart'
           archiveArtifacts artifacts: '**/repos/*.jar'
         }
       }
    }
}