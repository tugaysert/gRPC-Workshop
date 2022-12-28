package com.example.server;

import com.example.models.*;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<Money> responseObserver) {

        int accountNumber = request.getAccountNumber();
        int amount = request.getAmount();// like 10, 20, 30...
        int balance = AccountDatabase.getBalance(accountNumber);

        for (int i = 0; i < amount/10; i++) {
            AccountDatabase.deductBalance(accountNumber, 10);
            Money money = Money.newBuilder().setValue(10).setRemainingValue(AccountDatabase.getBalance(accountNumber)).build();
            responseObserver.onNext(money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }
}
