# Rest Assured FrameWork Sample

### Pre-Setup
There are certain pre-requisites that is needed to set up to test api end-points
  - Fork this project into your local machine 
  [https://github.com/james-willett/VideoGameDB] VideoGame project 
  - Run the gradle script as mentioned in the videoGame project README file
  - Launch this url [http://localhost:8080/swagger-ui/index.html#/]

### Running RestAssured Test

  - Clone this project into the machine
  - Java 8 need to be installed on the machine
  ```sh
$ mvn clean test
$ mvn -Dtest=* test
```