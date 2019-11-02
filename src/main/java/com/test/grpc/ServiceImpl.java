package com.test.grpc;

import
import io.grpc.stub.StreamObserver;

public class ServiceImpl    extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

        @Override
        public void greet (GreetRequest request, StreamObserver < GreetResponse > responseObserver){
            Greeting greeting = request.getGreeting();
            String firstName = greeting.getFirstName();

            // create the response
            String result = "Hello " + firstName;
            GreetResponse response = GreetResponse.newBuilder()
                    .setResult(result)
                    .build();
            responseObserver.onNext(result);
            responseObserver.onCompleted();
        }
    }
