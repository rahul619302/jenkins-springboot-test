node('master'){
    stage('clone'){
        git 'https://github.com/rahul619302/jenkins-springboot-test.git'
    }
    stage('build'){
        sh 'mvn clean compile install package -Dmaven.test.skip=true'
    }
    stage('deploy'){
        sh 'BUILD_ID=dontKillMe JENKINS_NODE_COOKIE=dontKillMe java -Dhudson.util.ProcessTree.disable=true -jar target/JenkinsSpringBootTest.jar &'
    }
}