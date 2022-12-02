package dk.via.scrum;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class RunServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090).addService(new ScrumServer()).build();
        server.start();
        System.out.println("Server Started");
        server.awaitTermination();

    }
}
