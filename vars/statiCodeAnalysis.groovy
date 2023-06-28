def call(credentialsId){
    sh 'export SONAR_TOKEN="squ_45555e3f212a533e34fae7614d671178ab1ab066"'
    sh 'mvn clean package sonar:sonar -Dsonar.login=$SONAR_TOKEN'
    //withSonarQubeEnv(credentialsId: credentialsId) {
    //     sh 'mvn clean package sonar:sonar'
    //}
}
