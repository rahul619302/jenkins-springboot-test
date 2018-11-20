node('master'){	

    stage('clone'){
        git 'https://github.com/rahul619302/jenkins-springboot-test.git'
    }
	
    stage('build'){
        sh 'mvn clean compile install package -Dmaven.test.skip=true'
    }
	
	stage('checkout') {
		checkout scm
	}

    stage('Building image') {
		sh "docker build -t spring-boot-jenkins-test:${env.BUILD_ID} -f Dockerfile ."
	}
	
	stage('run image') {
		sh "docker run -dp 9067:9067 spring-boot-jenkins-test:${env.BUILD_ID}"
	}

}