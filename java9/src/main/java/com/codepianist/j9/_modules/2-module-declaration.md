# Module declaration

Declaring a module in Java involves several key steps, especially since the introduction of the Java Platform Module System (JPMS) in Java 9. This system modularizes the JDK and helps developers create modular applications. Here’s a step-by-step guide to declaring a module:

1. Create a Module Descriptor
   The core of a module is its module descriptor, which is a file named module-info.java. This file must reside in the root directory of the module’s source code.
   Example module-info.java:
```java
module com.example.myapp {
   requires java.sql; // Declares a dependency on another module
   exports com.example.myapp.api; // Specifies packages to be accessible to other modules
}
```
madeiramadeira.com.br.md
2. Define the Module Name
   The module keyword is followed by the name of the module. It’s recommended to use a reverse domain name convention to avoid naming conflicts, similar to package naming.
   Example:
```java
   module com.example.myapp {
   // module body
   }
```

3. Declare Dependencies
   Use the requires keyword to specify dependencies on other modules. This tells the module system that your module depends on other modules to function.
   Example:
```java
   Copy code
   module com.example.myapp {
   requires java.sql;
   requires another.module;
   }
```
4. Export Packages
   Use the exports keyword to make specific packages available to other modules. Only the public classes and interfaces in these packages will be accessible to other modules.
   Example:
```java
   Copy code
   module com.example.myapp {
   exports com.example.myapp.api;
   }
```
5. Additional Directives
   requires transitive: Indicates that any module requiring your module will also implicitly require the transitive dependencies.
   uses: Specifies a service used by the module.
   provides ... with: Specifies the service implementations provided by the module.
   Example:
```java
   Copy code
   module com.example.myapp {
   requires transitive another.module;
   uses com.example.myapp.service.MyService;
   provides com.example.myapp.service.MyService with com.example.myapp.service.impl.MyServiceImpl;
   }
```
6. Organize Source Files
   Place the module-info.java file at the root of the module source directory.
   Organize your source files in a directory structure that mirrors the package structure.
   Example Directory Structure:
   arduino
```
   com.example.myapp/
   ├── module-info.java
   └── com/
   └── example/
   └── myapp/
   ├── api/
   │   ├── PublicClass1.java
   │   └── PublicClass2.java
   ├── service/
   │   ├── MyService.java
   │   └── impl/
   │       └── MyServiceImpl.java
   └── internal/
   └── InternalClass.java
```

7. Compile and Run the Module
   Use the javac command to compile the module. Ensure that the module path is set correctly to include any required modules.
   Compilation Example:
```shell 
    javac -d mods/com.example.myapp --module-source-path src $(find src -name "*.java")
   Use the java command to run the module, specifying the module path and the module and class to be executed.
   Run Example:
```

```shell 
java --module-path mods -m com.example.myapp/com.example.myapp.MainClass
```
8. Packaging and Distribution
   Package the module into a modular JAR file. A modular JAR includes the module descriptor module-info.class in its root directory.
   Packaging Example:
```shell
   jar --create --file=lib/com.example.myapp.jar --main-class=com.example.myapp.MainClass -C mods/com.example.myapp .
```

9. Testing the Module
   Ensure that you test the module, including checking for any module-related issues like missing exports or incorrect dependencies.
   By following these steps, you can declare and set up a module in Java, leveraging the Java Platform Module System for better encapsulation, dependency management, and modularization.