def call(String url, String branch){
  echo "Clonning code from git repo."
  git url:"${url}", branch:"${branch}"
  echo "Cloning completed" 
}
