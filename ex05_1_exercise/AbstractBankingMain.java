package ex05_1_exercise;

public class AbstractBankingMain {

    public static void main(String[] args) {
        Bank bank = new Bank(); // Creates a new instance of the Bank class, which likely holds customers.
        initializeCustomers(bank); // Calls the initializeCustomers method and passes the bank object to add customers and accounts.

        // run the customer report
        CustomerReport report = new CustomerReport();// Creates an instance of CustomerReport which probably handles printing or generating a report of customers.
        report.setBank(bank); // Sets the bank instance in the report so it knows which bank's data to use.
        report.generateReport(); // Triggers the report generation (likely prints customers and their accounts).
    }

    private static void initializeCustomers(Bank bank) { // A private helper method that takes a bank and adds some sample customers and accounts.
        Customer customer; //Declares a variable to hold each customer temporarily.
        // Create several customers and their accounts
        bank.addCustomer("Will", "Smith"); // Adds a customer "Will Smith" to the bank.
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00)); // Gets the first customer (Will) and adds a SavingsAccount with a starting balance of R500.

        bank.addCustomer("Bradley", "Cooper");
        customer = bank.getCustomer(1);
        SavingsAccount sack = new SavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(2);
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(3);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(4);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(5);
        CheckingAccount chkAcct = new CheckingAccount(100.00);

        customer.addAccount(chkAcct);

        if (chkAcct.withdraw(900.00)) {
            customer.addAccount(chkAcct);
            System.out.print(" withdraw is successful" + chkAcct.getBalance());
        }

    }

    }


    // This class simulates a small banking system. It:
//
//Creates a Bank object.
//
//Adds several customers with either savings or checking accounts.
//
//Performs some deposits and a withdrawal.
//
//Then it uses CustomerReport to generate a report of all customers and their accounts.
//
//It serves as a demo or test setup for a larger banking application.
//
//Let me know if you want the implementations for Bank, Customer, SavingsAccount, or CheckingAccount explained or created.
