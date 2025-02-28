pipeline {
    agent any
    stages {
        stage('Build and Deploy All Services') {
            parallel {
                stage('Accounts Service') {
                    steps {
                        build job: 'team4-accounts', wait: true
                    }
                }

                stage('Cards Service') {
                    steps {
                        build job: 'team4-cards', wait: true
                    }
                }

                stage('Loans Service') {
                    steps {
                        build job: 'team4-loans', wait: true
                    }
                }

                stage('EurekaServer Service') {
                    steps {
                        build job: 'team4-eurekaserver', wait: true
                    }
                }

                stage('ConfigServer Service') {
                    steps {
                        build job: 'team4-configserver', wait: true
                    }
                }

                stage('GatewayServer Service') {
                    steps {
                        build job: 'team4-gatewayserver', wait: true
                    }
                }

                stage('Kafka Service') {
                    steps {
                        build job: 'team4-kafka', wait: true
                    }
                }
				
                stage('Rabbitmq Service') {
                    steps {
                        build job: 'team4-rabbitmq', wait: true
                    }
                }
            }
        }
    }
}

