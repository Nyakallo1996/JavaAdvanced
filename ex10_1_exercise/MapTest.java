package ex10_1_exercise;

import java.util.List;

/**
 *
 * @author oracle
 */
public class MapTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList(); // Calls a static method createTxnList() from the SalesTxn class, which returns a list of sales transactions (SalesTxn objects).

        System.out.println("=== Widget Pro Sales Tax in CA ==="); // Prints a header line for clarity in the console output.

        tList.stream() // Starts a stream from the transaction list tList for processing.
                .filter(t -> t.getState().equals(State.CA))
                .filter(t-> t.getProduct().equals("Widget Pro"))
                .map(t -> t.getTransactionTotal() * TaxRate.byState(t.getState()))
                .forEach(amt -> System.out.printf("Txn tax: $%,9.2f%n", amt));

    }
}

// This program processes a list of sales transactions to:
//
//Find all "Widget Pro" transactions in California,
//
//Calculate the sales tax for each,
//
//And print the tax amounts formatted as currency.
//
//It demonstrates Java Streams, including filtering, mapping, and output formatting.
