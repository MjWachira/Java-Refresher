🔹 What is a Build Tool?
Build tools like Maven and Gradle help:

Compile code

Download and manage dependencies (external libraries)

Package the app (e.g., .jar or .war)

Run tests

Deploy artifacts

They use configuration files (pom.xml for Maven, build.gradle for Gradle) to automate everything.

🛠️ Maven
📄 pom.xml (Project Object Model)
This XML file defines your Maven project.

xml
Copy
Edit
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
                             
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId> <!-- Organization -->
    <artifactId>helloworld</artifactId> <!-- App name -->
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- Example: JUnit dependency for testing -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
🧪 Basic Maven Commands
Run these in the directory with pom.xml:

sh
Copy
Edit
mvn compile        # Compile your code
mvn package        # Package your app into a JAR/WAR
mvn test           # Run unit tests
mvn clean          # Remove generated files
🗂 Maven Directory Structure
bash
Copy
Edit
project-root/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/example/App.java
    └── test/
        └── java/
            └── com/example/AppTest.java
⚙️ Gradle
Gradle uses a Groovy or Kotlin-based DSL (domain-specific language) instead of XML.

📄 build.gradle (Groovy style)
groovy
Copy
Edit
plugins {
    id 'java'
}

group = 'com.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.9.2'
}

test {
    useJUnitPlatform()
}
🧪 Basic Gradle Commands
sh
Copy
Edit
gradle build       # Compile and test the project
gradle run         # Run the application (requires application plugin)
gradle clean       # Clean up generated files
You can also use the Gradle Wrapper (./gradlew build) for consistent builds across environments.

🗂 Gradle Directory Structure
Same as Maven by default:

bash
Copy
Edit
project-root/
├── build.gradle
└── src/
    ├── main/java/
    │   └── com/example/App.java
    └── test/java/
        └── com/example/AppTest.java
✅ Summary: Maven vs Gradle
Feature	Maven	Gradle
Config Format	XML (pom.xml)	Groovy/Kotlin DSL
Verbosity	Verbose	Concise
Performance	Slower (no daemon)	Faster (uses daemon)
Popularity	Very popular	Growing fast