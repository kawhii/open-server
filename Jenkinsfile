node {
   MVN_HOME = 'F:/software/java tools/apache-maven-3.5.0'        
   stage('Clone Code') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/kawhii/open-server.git/'
   }
   stage('Code Analysis') {
       bat "mvn clean"
   }
   stage('Testing') {
       bat "mvn test"
   }
   stage('Package') {
       bat "mvn -Dmaven.test.skip=true package"
       archive 'target/*.jar'
   }
   stage('Deploy') {
       echo 'pipeline success'
   }
}
