package chap9.item58;

public class ATM {

    private final long amount;

    public ATM(long amount) {
        this.amount = amount;
    }

    public void process(long amt) throws TransactionException {
        if (this.amount < amt) {
            throw new TransactionException(amount);
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(200);

        try {
            atm.process(2000);
        } catch (TransactionException e) {
            e.printStackTrace();
            System.out.println(e.getAmountInCents());
        }
    }

}
