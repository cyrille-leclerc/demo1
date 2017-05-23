node {
    stage ('Build') {
        checkout scm
        withMaven(maven: 'maven-3.5') {
            sh "mvn clean install"
        }
    }
}