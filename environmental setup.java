Creating pom.xml 
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>SpringSetup</groupId>
  <artifactId>SpringSetup</artifactId>
  <packaging>war</packaging>
  <version>0.0.1-SNAPSHOT</version>
  <name>SpringSetup Maven Webapp</name>
  <url>http://maven.apache.org</url>
  
   <properties>
    <org.springframework.version>5.1.6.RELEASE</org.springframework.version>
  </properties>
  
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-expression</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context-support</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
      
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-orm</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
 
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>${org.springframework.version}</version>
    </dependency>
     
       
 
    <dependency>
        <groupId>javassist</groupId>
        <artifactId>javassist</artifactId>
        <version>3.12.1.GA</version>
    </dependency>
  
  
     
    <dependency>
        <groupId>taglibs</groupId>
        <artifactId>standard</artifactId>
        <version>1.1.2</version>
        <scope>runtime</scope>
    </dependency>
     
    <dependency>
      <groupId>commons-dbcp</groupId>
      <artifactId>commons-dbcp</artifactId>
      <version>1.4</version>
    </dependency>
         
 <dependency> 
<groupId>javax.servlet</groupId> 
<artifactId>jstl</artifactId> 
<version>1.2</version> 
</dependency>

<dependency> 
<groupId>javax.servlet</groupId> 
<artifactId>jstl</artifactId>
 <version>1.2</version> 
</dependency>

<dependency> 
<groupId>javax.persistence</groupId> 
<artifactId>persistence-api</artifactId> 
<version>1.0.2</version> 
<scope>provided</scope>
 </dependency>


 
  </dependencies>
  <build>
    <finalName>SpringSetup</finalName>
  </build>
</project>
