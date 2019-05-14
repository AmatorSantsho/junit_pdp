# junit_pdp

### Run all tests in maven:  
mvn clean test
### Run all Suite in maven:  
mvn clean test -Dtest=SuiteTestClass
### Run tests from main method in class Runner using maven:
mvn clean compile exec:java
### Run tests from one class from custom Runner which wrap exception:
mvn clean  test -Dtest=CustomRuntimeTest


