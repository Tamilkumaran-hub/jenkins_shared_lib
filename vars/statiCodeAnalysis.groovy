def call(credentialsId){
    sh 'mvn clean package sonar:sonar'
    //withSonarQubeEnv(credentialsId: credentialsId) {
    //     sh 'mvn clean package sonar:sonar'
    //}
}
