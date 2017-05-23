node {
    stage ('Build') {
        checkout scm
        withMaven(maven: 'maven-3.5', mavenSettingsConfig: 'my-settings') {
            sh "mvn clean deploy"
        }
    }
}