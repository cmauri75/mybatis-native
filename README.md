# Mybatis Spring Native

A spring example using mybatis and executed both native and standard way

Standard build:
```
./mvnw clean package
java -jar target/mybatis-native-0.0.1-SNAPSHOT-exec.jar
```

Native build:
```
./mvnw -Pnative -DskipTests=true clean package
target/mybatis-native
```
