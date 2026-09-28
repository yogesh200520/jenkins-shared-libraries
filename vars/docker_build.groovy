def call(string Projectname, string Imagetag, string Dcokerhubuser){
  sh "docker buid -t ${dockerhubuser}/${projectname}:${imagetag}
}
