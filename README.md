# quarkus-vscode-java-test

Project to demonstrate that the coverage of tests annotated with `@QuarkusTest` (`GreetingResourceTest.java`) is not displayed in vscode, but the coverage of the other tests (`CollectionUtilsTest.java`) is displayed.

Test coverage:

```shell script
./mvnw -V clean verify
google-chrome target/jacoco-report/index.html
```

Run your application:

```shell script
./mvnw -V compile quarkus:dev
```
