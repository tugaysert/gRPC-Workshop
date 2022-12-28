package com.example.client;

import com.example.models.Money;
import io.grpc.stub.StreamObserver;

public class MoneyStreamingResponse implements StreamObserver<Money> {
    @Override
    public void onNext(Money money) {
        System.out.println("Received async: " + money.getValue() + " , Remaining async: " + money.getRemainingValue());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        System.out.println("Server is Done!");
    }
}
