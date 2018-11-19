node("master"){
    stage("clone git hub"){
        git 'https://github.com/rahul619302/jenkins-springboot-test.git'
    }
    stage("build"){
        sh 'mvn install'
    }
    stage("run"){
        sh 'java -jar JenkinsSpringBootTest.jar'
    }
}