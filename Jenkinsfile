pipeline {
    agent any
    
    stages {
        stage('Build and Deploy All') {
            parallel {
                stage('Accounts Service') {
                    steps {
                        dir('accounts') {
                            sh './mvnw clean package'
                            sh 'docker build -t accounts-service .'
                            // Kubernetes 배포
                            sh 'kubectl apply -f app-accounts.yaml'
                        }
                    }
                }
                
                stage('Cards Service') {
                    steps {
                        dir('cards') {
                            sh './mvnw clean package'
                            sh 'docker build -t cards-service .'
                            // Kubernetes 배포
                            sh 'kubectl apply -f app-cards.yaml'
                        }
                    }
                }
                
                stage('Loans Service') {
                    steps {
                        dir('loans') {
                            sh './mvnw clean package'
                            sh 'docker build -t loans-service .'
                            // Kubernetes 배포
                            sh 'kubectl apply -f app-loans.yaml'
                        }
                    }
                }
                
                stage('Springboot-Edu Service') {
                    steps {
                        dir('springboot-edu') {
                            sh './mvnw clean package'
                            sh 'docker build -t springboot-edu-service .'
                            // Kubernetes 배포
                            sh 'kubectl apply -f demo-app.yaml'
                        }
                    }
                }
            }
        }
    }
}

