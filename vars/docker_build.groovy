def call(string Projectname, string Imagetag, string Dcokerhubuser){
  sh "docker build -t ${dockerhubuser}/${projectname}:${imagetag}
}
