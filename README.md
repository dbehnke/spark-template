# spark-template
My template for Spark (java web framework)

The purpose of this template is to jumpstart development of a Java web application using the microframework Spark (http://sparkjava.com).

The goal was to create a simple HelloWorld application that could be run standalone as well as on a Java server such as Tomcat, Weblogic, etc.

## Quickstart

1. Install Java - http://java.com (you need the JDK not JRE to compile)

2. Install Gradle - https://gradle.org/gradle-download/

3. Clone Source

    git clone https://github.com/dbehnke/spark-template.git
    

4. gradle run

5. Visit http://localhost:4567/hello

## Integrating with an IDE

An IDE is optional, but usually prefered for working with Java.

IntelliJ (https://www.jetbrains.com/idea/) is the IDE I prefer to use.  As long as you have the gradle plugin installed, you should just be able to open this project as a gradle project.
The free Coummunity Edition is fine.

## Creating a FatJar

This will create a Jar file with all it's dependencies and allows you to run the application standalone on any system with Java.

   gradle fatJar

The output will be in the builds/ directory

## Create a War for deployment

   gradle war

The war file will be in the builds/ directory, simply upload or deploy to your Java server of choice.

## Making it your own

1. Edit the build.gradle and change values to match your project.

2. Refactor the source code to match your project, rename HelloWorld.java, etc.

3. Point WebApp.java to your entry point.

4. Modify the src/main/webapp/WEB-INF/web.xml
