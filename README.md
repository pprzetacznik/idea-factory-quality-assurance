idea-factory-quality-assurance
==============================

The lecture about Quality Assurance and for Idea Facotory

Running code coverage
------------------------------

Run Server:

```bash
"C:\Program Files\Java\jdk1.7.0_25\bin\java.exe" -javaagent:org.jacoco.agent-0.7.1.201405082137-runtime.jar=destfile=jacoco-it.exec -cp "rmi-server/target/classes;rmi-server/target/lib/*;*;rmi-client/target/classes;rmi-client/target/lib/*;" pl.edu.knbit.qa.server.Server
```

Run all tests:

```bash
mvn install
```

Exit Server and generate jacoco-it.exec.

Run:

```bash
C:\sonar-runner-2.4\bin\sonar-runner
```

Alternative way
------------------------------

```bash
mvn sonar:sonar
```
