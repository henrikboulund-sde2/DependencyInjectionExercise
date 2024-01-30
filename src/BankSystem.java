public class BankSystem {
    public static void main(String[] args)
    {
        // Create instances of account types and transaction processors
        IAccount savingsAccount = new SavingsAccount();
        IAccount checkingAccount = new CheckingAccount();

        ITransactionProcessor normalProcessor = new NormalTransactionProcessor();
        ITransactionProcessor overdraftProcessor = new OverdraftTransactionProcessor();

        // Demonstrate transactions using different processors
        normalProcessor.processTransaction(savingsAccount, 100.0);
        overdraftProcessor.processTransaction(checkingAccount, 200.0);

        // Print final balances...

    }
}
