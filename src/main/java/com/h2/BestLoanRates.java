package com.h2;

import java.util.Scanner;
import java.util.Map;
public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of( // Map takes in integer and float  and final mens it cant be changed
     1, 5.50f, 
     2, 3.45f, 
     3, 2.67f

    );
   
    public static void main(String[] args){ // void is the return type as it returns nothing and takes in the parameters string called args
    Scanner scanner = new Scanner(System.in) ; // we have the class called scanner and the object called scanner and initialize with constructor using new ... name of class and use system.in so we expect an input fro m the user 
    System.out.println("Enter your name"); // prints out to user to ask for user info 
    String name = scanner.nextLine();// we have te user input stored in variable name as we use object scaanner from line 8 an next line stores whole line
    System.out.println("Hello " + name); // print  using name info taken from user.
    
    System.out.println("Enter the loan term in years");
    int loanTermInYears=scanner.nextInt();
    float bestRate=getRates(loanTermInYears);
    if (bestRate==0.0f){
        System.out.println("No available rates for term: " + loanTermInYears + " years"); 
    }else{
        System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
    }
    scanner.close();// scanner function closes
}
    public static float getRates(int loanTermInYears) {// returns a float and take in an int parameter called LoanTermInYears
    if(bestRates.containsKey(loanTermInYears)){ //cointainskey means does the map we have the value 
        return bestRates.get(loanTermInYears);// then gets the coressponmding value
    }// use curly brackets since the else is just a return statement and not a print and does more
    return 0.0f;
}}