node('master'){	

    stage('git clone'){
        git 'https://github.com/rahul619302/jenkins-springboot-test.git'
    }
	
    stage('mvn build'){
        sh 'mvn clean compile install package -Dmaven.test.skip=true'
    }
	
	stage('checkout') {
		checkout scm
	}
	
    stage('Dockerfile build') {
		sh "docker build -t spring-boot-jenkins-test:${env.BUILD_ID} ."
	}
	
	stage('run image') {
		sh "docker run -dp 9067:9067 spring-boot-jenkins-test:${env.BUILD_ID}"
	}

	stage('tag image') {
		sh "docker tag spring-boot-jenkins-test:${env.BUILD_ID} rahul619302/first-docker-project:${env.BUILD_ID}"
	}
	
	stage('login') {
		sh "docker login -u rahul619302 -p *******"
	}
	
	stage('push image') {
		sh "docker push rahul619302/first-docker-project:${env.BUILD_ID}"
	}

}
