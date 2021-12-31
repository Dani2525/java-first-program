package com.h2;
import java.text.DecimalFormat;
public class MortgageCalculator { // creating a class with properties needed
    private int termInYears;
    private float annualRate;
    private double monthlyPayment;
    private long loanAmount;

    public MortgageCalculator(long loanAmount,int termInYears,float annualRate){// creating a constructuor that will accept the values so it takes in paprameters needed
      this.loanAmount= loanAmount;// differentiaitere from class to parameters 
      this.termInYears= termInYears;
      this.annualRate=annualRate;

    }
    private int getNumberOfPayments(){// how many payments monlthy
     return termInYears * 12;  
    }
    
    private float getMonthlyInterestRate(){
        float interestRate = annualRate/100;
        return interestRate/12;
    }
    public void calculateMonthlyPayment(){ 
        long P = loanAmount;
        float r = getMonthlyInterestRate();
        int n = getNumberOfPayments();
        double M = P * (((r * Math.pow(1 + r, n))) / ((Math.pow((1 + r), n)) - 1));
        M = this.monthlyPayment;// assign to object
    }
    public String toString(){
        DecimalFormat df = new DecimalFormat("####0.00");// intialise decimal format by using decimalformat hides the rest of hashtags 
        return "monthlyPayment:  " + df.format(monthlyPayment);

    }
    public static void main(String[] args){ 
        long loanAmount =Long.parseLong( args[0]); // converts long to string and 1st in the array
        int termInYears = Integer.parseInt(args[1]);
        float annualRate= Float.parseFloat(args[2]);{
        
        MortgageCalculator calculator=new MortgageCalculator(loanAmount, termInYears, annualRate); // craetig an obeject with the properties
        calculator.calculateMonthlyPayment();
        System.out.println(calculator.toString());
    }


}}
