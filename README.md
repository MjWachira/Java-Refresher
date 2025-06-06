# 📚 Java Refresher Course – From Basics to Advanced

This repository contains a structured Java learning path designed as a full refresher course, ideal for developers with experience in other languages (like .NET) who want to become proficient in Java

## 🗂 Project Structure

```
JavaRefresher/
├── 01_Basics/
├── 02_OOP/
├── 03_Collections/
├── 04_Advanced/
├── 05_Generics/
├── 06_BuildTools/
└── README.md
```

## ✅ Topics Covered

### `01_Basics` – Java Language Fundamentals
- `HelloWorld.java`: First program
- `VariablesAndDataTypes.java`: Java variable types
- `ControlFlow.java`: `if`, `switch`, `while`, `for`
- `Functions.java`: Defining and using methods

### `02_OOP` – Object-Oriented Programming
- `Person.java`, `Car.java`: Classes, objects
- `Inheritance.java`: `extends`, superclasses
- `Polymorphism.java`: Method overriding
- `Interfaces.java`: Implementing interfaces
- `Encapsulation.java`: Using `private` fields and getters/setters

### `03_Collections` – Working with Data Structures
- `ArrayListExample.java`: Dynamic arrays
- `HashMapExample.java`: Key-value pairs
- `SetExample.java`: Unique value storage
- `IteratorExample.java`: Looping over collections

### `04_Advanced` – Core Java APIs and Concepts
- `ExceptionHandling.java`: `try-catch-finally`, throwing exceptions
- `FileHandling.java`: Reading/writing text files
- `Threading.java`: Multithreading with `Thread` and `Runnable`
- `LambdaExpressions.java`: Functional interfaces and lambdas
- `StreamsExample.java`: Processing collections with `Stream` API

### `05_Generics` – Type-Safe Programming
- `GenericsOverview.java`: Covers:
  - Generic collections (`List<String>`)
  - Custom generic classes
  - Generic methods
  - Bounded generics (`<T extends Number>`)

### `06_BuildTools` – Maven & Gradle Basics
- `pom.xml`: Maven project configuration
- `build.gradle`: Gradle configuration with JUnit dependency
- Guide to folder structure and common commands for both tools

## 📦 Build and Run Instructions

### Using **Maven**:

```bash
mvn compile
mvn package
mvn exec:java -Dexec.mainClass="your.main.ClassName"
```

### Using **Gradle**:

```bash
gradle build
gradle run
```

## 📌 Requirements
- JDK 17+ recommended
- Maven or Gradle installed
- IDE (e.g. IntelliJ IDEA, Eclipse, VS Code)

