package chap9.item58;

import lombok.Getter;

public class TransactionException extends Exception {

    @Getter
    private final long amountInCents;

    public TransactionException(long amountInCents) {
        this.amountInCents = amountInCents;
    }

}
