1- download the git hub project from https://github.com/yaraalkhader/Expedia
2- install mvn 
    download it from http://maven.apache.org/download.cgi
    pico ~/.bash_profile
    update the values
    export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home
    export M2_HOME=/Users/yk/Tools/apache-maven-3.3.9
    export PATH=$PATH:$M2_HOME/bin

3- run mvn package
4- run java -jar target/dependency/webapp-runner.jar target/*.war

assumption is that the sandbox has java installed, if not it has to be installed.
the variables listed above uses the path from the development envionemnt and has to be changed to the sandbox one
    
    



