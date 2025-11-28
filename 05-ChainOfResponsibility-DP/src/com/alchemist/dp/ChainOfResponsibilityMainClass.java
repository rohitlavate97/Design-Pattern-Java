package com.alchemist.dp;

import java.util.Scanner;

public class ChainOfResponsibilityMainClass {

    private DispenseChain chain;

    public ChainOfResponsibilityMainClass() {
        this.chain = new Notes2000Rack();
        DispenseChain c500 = new Notes500Rack();
        DispenseChain c100 = new Notes100Rack();

        chain.chain(c500);
        c500.chain(c100);
    }

    public static void main(String[] args) {

        ChainOfResponsibilityMainClass atm = new ChainOfResponsibilityMainClass();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter amount to withdraw (0 to exit):");

            int amount = sc.nextInt();
            if (amount == 0) {
                System.out.println("Thank you! Exiting...");
                break;
            }

            if (amount % 100 != 0) {
                System.out.println("Amount must be multiple of 100.");
                continue;
            }

            atm.chain.dispence(new Currency(amount));
            System.out.println("------------------------------------");
        }

        sc.close();
    }
}
