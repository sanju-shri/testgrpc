package com.test.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Grpc {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(" Hello from Grpc");

        Server server = ServerBuilder.forPort(50051)
                .addService(new ServiceImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println(" shutdown req");
            server.shutdown();

        }

        ));

        server.awaitTermination();
    }
}
