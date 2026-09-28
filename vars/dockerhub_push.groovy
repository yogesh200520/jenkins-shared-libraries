def call(string credid, String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'credid', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
