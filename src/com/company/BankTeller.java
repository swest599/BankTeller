package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public  class BankTeller {

    Scanner scanner = new Scanner(System.in);
    HashMap<String, ArrayList<Double>> userCred = new HashMap<String, ArrayList<Double>>();
    HashSet<User> name = new HashSet<>();
    ArrayList<Double> userInfo = new ArrayList<>();
    String signInInput = scanner.nextLine();

    // to make the  users account.
    char c = scanner.next().charAt(0);
//    System.out.println("What is your name");

    double balance;
    int accNum;
    String name;


    public void startBank(){
        input();
        showMenu();
        //customerList();
    }
    private void input() {
//sign in feature
        System.out.println("Name?");
        System.out.println("");
        String name = scanner.nextLine();



        do {
            signInInput = scanner.next();
        }
        while (userCred.keySet() != signInInput);

    }

    //
    //

    public void showMenu(){
        System.out.println("Please choose an option:");
        char option = 'Z';
        System.out.println("A: Deposit");
        System.out.println("B: withdraw");
        System.out.println("C: Transfer");
        System.out.println("D: Remove");
        System.out.println("E: Exit");

        do{

            option = scanner.next().charAt(0);
            if(scanner.next().length() - 1 > 1){
                break;
//                if (scanner.next().)
            }



            switch (option) {
// deposit
                case 'A':
                    //
                    input();
                    System.out.println("How much money do you want to Deposit?");
                    System.out.println("\n");
                    balance = scanner
                    userInfo.add(1,balance);
                    break;
// withdraw
                case 'B':
                    input();
                    System.out.println("How much money do you want to Withdraw?");
                    System.out.println("\n");

                    break;
// transfer
                case 'C':
                    break;
// remove
                case 'D':
                    input();
                    break;
// New User
                case 'E':
                    name = scanner.nextLine();
                    userCred.put(name., );
                    break;
// Fawud out
                case 'F':
                    startBank();
                    break;
                default:
                    System.out.println("Invalid entry please try again.");
            }
        }while (option != 'F');
    }

//    private void customerList() {
//        input();
//        showMenu();
//        for (String s :userCred){
//
//        }
//    }
}