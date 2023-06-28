

def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {
        waitForQualityGate abortPipeline: false, credentialsId: 'sonar'
    }
}


