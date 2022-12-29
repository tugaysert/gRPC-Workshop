package com.example.server;

import com.example.models.Die;
import com.example.models.GameServiceGrpc;
import com.example.models.GameState;

import com.example.models.Player;
import io.grpc.stub.StreamObserver;


public class GameService extends GameServiceGrpc.GameServiceImplBase {

    @Override
    public StreamObserver<Die> gameFlow(StreamObserver<GameState> responseObserver) {
        Player client = Player.newBuilder()
                .setName("client")
                .setPosition(0)
                .build();

        Player server = Player.newBuilder()
                .setName("server")
                .setPosition(0)
                .build();

        return new DieStreamingRequest(client, server, responseObserver);
    }
}
