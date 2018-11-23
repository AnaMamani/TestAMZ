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
       stage ('Build_webApplication') {
         steps {
           sh './webApplication/gradlew clean assemble -p webApplication'
           sh './webApplication/gradlew uploadArchives -p webApplication'
           archiveArtifacts artifacts: '**/repos/*.war'
         }
       }
       stage ('Testing_webApplication') {
         steps {
           sh './webApplication/gradlew test -p webApplication'
           archiveArtifacts artifacts: '**/reports/tests/test/*.html'
         }
       }
       stage ('Security_webApplication') {
         steps {
           sh './webApplication/gradlew  sonarqube -p webApplication '
           sh './webApplication/gradlew  dependencyCheckAnalyze -p webApplication'
           archiveArtifacts artifacts: '**/reports/*.html'
         }
       }
       stage ('Deploy_webApplication') {
         steps {
           sh './webApplication/gradlew -b deploy.gradle copyWar'         
         }
       }
    }
}