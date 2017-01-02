## Running the program in C9

1. Use the link to clone the C9 workspace. [Clone Workspace](https://c9.io/new/clone?name=javac9lab-cloned&cloneFromWorkspace=sudhar%2Fjavac9lab&description=&private=false).
2. Java command to compile `javac (filename.java)`.
3. Java command to run `java (filename)`. 

Note: install java in your C9 workspace incase it is not in-built.

Use the C9 ternminal for the installation process

Installing Java with `apt-get` is easy. First, update the package index:

```
sudo apt-get update
```
Then, check if Java is not already installed:
```
java -version
```
If it returns "The program java can be found in the following packages", Java hasn't been installed yet, so execute the following command:
```
sudo apt-get install default-jre
```
This will install the Java Runtime Environment (JRE). If you instead need the Java Development Kit (JDK), which is usually needed to compile Java applications (for example Apache Ant, Apache Maven, Eclipse and IntelliJ IDEA execute the following command:
```
sudo apt-get install default-jdk
```

That is everything that is needed to install Java.
