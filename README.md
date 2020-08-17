# Expense Tracker

## Build native image

mvn clean package -Pnative   
docker build -f src/main/docker/Dockerfile.native -t mapstruct-examples-quarkus .   
docker run -i --rm -p 8080:8080 mapstruct-examples-quarkus   
