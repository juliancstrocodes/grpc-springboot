
# gRPC and Spring Boot Demo

Learning to implement gRPC onto a Spring Boot project.
## Demo

In order to test this application, clone the repository.

Navigate to the **greeting-service/src/main/java/com/grpcex/grpc/GrpcSpringbootExApplication.java**

**Run this file.**

Then, on the command line, run:

```
grpcurl --plaintext -d '{"message": "How are you?"}' localhost:9090 com.grpcex.grpc.GreetingService/greeting

```

The message property is completely customizable, in this case the message is "How are you?" so the response will look like:

```
{
  "message": "Received your How are you?. Hello From Server. "
}
```

And on the command line of the running application you will see the following message:
```
Received message: How are you?

```

This means that the gRPC service has communicated within the Spring Boot project.
