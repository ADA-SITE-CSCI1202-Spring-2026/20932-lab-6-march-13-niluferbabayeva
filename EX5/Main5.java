package EX5;

public class Main5 {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Nilufar", 500.0);
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(200.0);
        System.out.println("After deposit: " + acc.getBalance());

        try {
            acc.withdraw(100.0);
            System.out.println("After withdrawal: " + acc.getBalance());

            acc.withdraw(1000.0); // this will throw
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
