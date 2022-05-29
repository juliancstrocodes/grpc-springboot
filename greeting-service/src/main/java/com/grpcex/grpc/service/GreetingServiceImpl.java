package com.grpcex.grpc.service;

import com.grpcex.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    
    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        String message = request.getMessage();
        System.out.println("Received message: " + message);

        GreetingResponse response = GreetingResponse.newBuilder()
            .setMessage("Received your " + message + ". Hello From Server. ").build();
        
        // Send response to client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}