def call(credentialsId){
    sh 'mvn clean package sonar-api:sonar-api'
    //withSonarQubeEnv(credentialsId: credentialsId) {
    //     sh 'mvn clean package sonar:sonar'
    //}
}
