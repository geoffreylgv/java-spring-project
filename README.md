# java-spring-project <a target="_blank" href="https://github.com/geoffreylgv/java-spring-project"><img src="https://img.shields.io/github/last-commit/geoffreylgv/java-spring-project" /></a>
>> #### Repository Description Content
  +  Spring Boot, 
  +  Java API REST, 
  +  Java Web Application, 
  <table>
  <thead>
    <th>Back End</th>
    <th> Front End</th>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2">Java</td>
      <td>Apache Wicket</td>
    </tr>
    <tr>
      <td>Angular</td>
    </tr>
  </table>


>> #### Use Guide/Contribution
- Star and Fork the repo
- Create local branch named it <i>yourusername</i>
- Edit contribute
- Create pull request

```bash
  # create branch
  $ git checkout -b yourusername
  # clone the forked repo
  $ git clone https://github.com/yourusername/java-spring-project.git
```


>> #### Repo Navigation/Repo Structure

```bash
LICENSE
README.md
pom.xml
weather-java-web
   |-- nb-configuration.xml
   |-- pom.xml
   |-- src
   |   |-- main
   |   |   |-- java
   |   |   |   |-- com
   |   |   |   |   |-- geoffreylgv
   |   |   |   |   |   |-- weather
   |   |   |   |   |   |   |-- java
   |   |   |   |   |   |   |   |-- web
   |   |   |   |   |   |   |   |   |-- WeatherJavaWeb.java
   |   |   |   |   |   |   |   |   |-- base
   |   |   |   |   |   |   |   |   |   |-- BasePage.java
   |   |   |   |   |   |   |   |   |-- model
   |   |   |   |   |   |   |   |   |   |-- Coord.java
   |   |   |   |   |   |   |   |   |   |-- Main.java
   |   |   |   |   |   |   |   |   |   |-- Sys.java
   |   |   |   |   |   |   |   |   |   |-- Weather.java
   |   |   |   |   |   |   |   |   |   |-- WeatherResponse.java
   |   |   |   |   |   |   |   |   |   |-- Wind.java
   |   |   |   |   |   |   |   |   |-- pages
   |   |   |   |   |   |   |   |   |   |-- WeatherPage.html
   |   |   |   |   |   |   |   |   |   |-- WeatherPage.java
   |   |   |   |   |   |   |   |   |   |-- css
   |   |   |   |   |   |   |   |   |   |   |-- style.css
   |   |   |   |   |   |   |   |   |-- services
   |   |   |   |   |   |   |   |   |   |-- JsonConvertion.java
   |   |   |   |   |   |   |   |   |   |-- WeatherResponseHttpClient.java       
   |   |   |-- resources
   |   |   |   |-- application.properties
   |   |   |   |-- xample
   |   |   |-- webapp
   |   |   |   |-- META-INF
   |   |   |   |   |-- context.xml
   |-- target
   |   |-- classes
   |   |   |-- application.properties
   |   |   |-- com
   |   |   |   |-- geoffreylgv
   |   |   |   |   |-- weather
   |   |   |   |   |   |-- java
   |   |   |   |   |   |   |-- web
   |   |   |   |   |   |   |   |-- WeatherJavaWeb.class
   |   |   |   |   |   |   |   |-- base
   |   |   |   |   |   |   |   |   |-- BasePage.class
   |   |   |   |   |   |   |   |-- model
   |   |   |   |   |   |   |   |   |-- Coord.class
   |   |   |   |   |   |   |   |   |-- Main.class
   |   |   |   |   |   |   |   |   |-- Sys.class
   |   |   |   |   |   |   |   |   |-- Weather.class
   |   |   |   |   |   |   |   |   |-- WeatherResponse.class
   |   |   |   |   |   |   |   |   |-- Wind.class
   |   |   |   |   |   |   |   |-- pages
   |   |   |   |   |   |   |   |   |-- WeatherPage.class
   |   |   |   |   |   |   |   |   |-- WeatherPage.html
   |   |   |   |   |   |   |   |   |-- css
   |   |   |   |   |   |   |   |   |   |-- style.css
   |   |   |   |   |   |   |   |-- services
   |   |   |   |   |   |   |   |   |-- JsonConvertion.class
   |   |   |   |   |   |   |   |   |-- WeatherResponseHttpClient.class
   |   |   |-- xample
   |   |-- maven-archiver
   |   |   |-- pom.properties
   |   |-- maven-status
   |   |   |-- maven-compiler-plugin
   |   |   |   |-- compile
   |   |   |   |   |-- default-compile
   |   |   |   |   |   |-- createdFiles.lst
   |   |   |   |   |   |-- inputFiles.lst
   |   |   |   |-- testCompile
   |   |   |   |   |-- default-testCompile
   |   |   |   |   |   |-- createdFiles.lst
   |   |   |   |   |   |-- inputFiles.lst
   |   |-- weather-java-web-2.1.9.war
   |   |-- weather-java-web-2.1.9.war.original
   |   |-- weather-java-web-2.1.9
   |   |   |-- META-INF
   |   |   |   |-- context.xml
   |   |   |-- WEB-INF
   |   |   |   |-- classes
   |   |   |   |   |-- .netbeans_automatic_build
   |   |   |   |   |-- application.properties
   |   |   |   |   |-- com
   |   |   |   |   |   |-- geoffreylgv
   |   |   |   |   |   |   |-- weather
   |   |   |   |   |   |   |   |-- java
   |   |   |   |   |   |   |   |   |-- web
   |   |   |   |   |   |   |   |   |   |-- WeatherJavaWeb.class
   |   |   |   |   |   |   |   |   |   |-- base
   |   |   |   |   |   |   |   |   |   |   |-- BasePage.class
   |   |   |   |   |   |   |   |   |   |-- model
   |   |   |   |   |   |   |   |   |   |   |-- Coord.class
   |   |   |   |   |   |   |   |   |   |   |-- Main.class
   |   |   |   |   |   |   |   |   |   |   |-- Sys.class
   |   |   |   |   |   |   |   |   |   |   |-- Weather.class
   |   |   |   |   |   |   |   |   |   |   |-- WeatherResponse.class
   |   |   |   |   |   |   |   |   |   |   |-- Wind.class
   |   |   |   |   |   |   |   |   |   |-- pages
   |   |   |   |   |   |   |   |   |   |   |-- WeatherPage.class
   |   |   |   |   |   |   |   |   |   |   |-- WeatherPage.html
   |   |   |   |   |   |   |   |   |   |   |-- css
   |   |   |   |   |   |   |   |   |   |   |   |-- style.css
   |   |   |   |   |   |   |   |   |   |-- services
   |   |   |   |   |   |   |   |   |   |   |-- JsonConvertion.class
   |   |   |   |   |   |   |   |   |   |   |-- WeatherResponseHttpClient.class  
   |   |   |   |-- lib
   |   |   |   |   |-- asm-7.1.jar
   |   |   |   |   |-- asm-analysis-7.1.jar
   |   |   |   |   |-- asm-tree-7.1.jar
   |   |   |   |   |-- asm-util-7.1.jar
   |   |   |   |   |-- cglib-nodep-3.2.12.jar
   |   |   |   |   |-- classmate-1.5.1.jar
   |   |   |   |   |-- commons-codec-1.13.jar
   |   |   |   |   |-- commons-collections4-4.3.jar
   |   |   |   |   |-- commons-fileupload-1.4.jar
   |   |   |   |   |-- commons-io-2.6.jar
   |   |   |   |   |-- hibernate-validator-6.0.18.Final.jar
   |   |   |   |   |-- httpclient-4.5.10.jar
   |   |   |   |   |-- httpcore-4.4.12.jar
   |   |   |   |   |-- httpmime-4.5.10.jar
   |   |   |   |   |-- jackson-annotations-2.10.1.jar
   |   |   |   |   |-- jackson-core-2.10.1.jar
   |   |   |   |   |-- jackson-databind-2.10.1.jar
   |   |   |   |   |-- jackson-datatype-jdk8-2.10.1.jar
   |   |   |   |   |-- jackson-datatype-jsr310-2.10.1.jar
   |   |   |   |   |-- jackson-module-parameter-names-2.10.1.jar
   |   |   |   |   |-- jakarta.annotation-api-1.3.5.jar
   |   |   |   |   |-- jakarta.validation-api-2.0.1.jar
   |   |   |   |   |-- javax.inject-1.jar
   |   |   |   |   |-- jboss-logging-3.4.1.Final.jar
   |   |   |   |   |-- jdk-serializable-functional-1.8.5.jar
   |   |   |   |   |-- jul-to-slf4j-1.7.29.jar
   |   |   |   |   |-- log4j-api-2.12.1.jar
   |   |   |   |   |-- log4j-to-slf4j-2.12.1.jar
   |   |   |   |   |-- logback-classic-1.2.3.jar
   |   |   |   |   |-- logback-core-1.2.3.jar
   |   |   |   |   |-- lombok-1.18.10.jar
   |   |   |   |   |-- openjson-1.0.10.jar
   |   |   |   |   |-- slf4j-api-1.7.29.jar
   |   |   |   |   |-- snakeyaml-1.25.jar
   |   |   |   |   |-- spring-aop-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-beans-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-autoconfigure-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-starter-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-starter-json-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-starter-logging-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-starter-validation-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-boot-starter-web-2.2.2.RELEASE.jar
   |   |   |   |   |-- spring-context-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-context-support-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-core-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-expression-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-jcl-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-web-5.2.2.RELEASE.jar
   |   |   |   |   |-- spring-webmvc-5.2.2.RELEASE.jar
   |   |   |   |   |-- wicket-auth-roles-8.6.1.jar
   |   |   |   |   |-- wicket-core-8.6.1.jar
   |   |   |   |   |-- wicket-extensions-8.6.1.jar
   |   |   |   |   |-- wicket-ioc-8.6.1.jar
   |   |   |   |   |-- wicket-request-8.6.1.jar
   |   |   |   |   |-- wicket-spring-8.6.1.jar
   |   |   |   |   |-- wicket-spring-boot-context-2.1.9.jar
   |   |   |   |   |-- wicket-spring-boot-starter-2.1.9.jar
   |   |   |   |   |-- wicket-util-8.6.1.jar
   |   |   |   |   |-- wicketstuff-annotation-8.6.0.jar

```                                      
   
