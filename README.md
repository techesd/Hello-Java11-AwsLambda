# Hello-Java11-AwsLambda
Simple AWS Lambda test with Java 11

# First, you'll need
1. Download, Install and Configure [Amazon Corretto 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/windows-7-install.html)
2. Download, Install and Configure [Apache Maven](https://maven.apache.org/install.html)

# Try to understand
"pom.xml" file contains all information about the dependencies and plugins (Including the source and targe from compiler***)

# Generate Package | Build with Maven
Execute command: mvn package

# Put in AWS in a simple way
1. Create a new AWS lambda function with runtime value setup to "Java 11";
2. Upload .jar file generated with maven in target directory;
3. Save;
4. Create a simple test:
  4.1 Click in the "Test" button;
  4.2 Give an Event Name;
  4.3 Erase all json;
  4.4 Click in create and use it;
