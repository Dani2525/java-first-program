package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator { // blueprint that contains al the properties 
    
    private float[] credits; 
    private float[] debits;

    public SavingsCalculator( float[] credits,float[] debits){ // constructor to initalize and take in values as arrays 
        this.credits = credits; // this referes to the instace of the class 
        this.debits = debits;   

    }   
    private float sumOfCredits(){
        float sum = 0.0f;
        for (float credit: credits){
            sum += credit;
        }
        return sum;
    }
    private float sumOfDebits(){
        float sum= 0.0f;
        for (float debit:debits){
            sum += debit;
        }
        return sum;
    } 
    private static int remainingDaysInMonth(LocalDate date){
    YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth()); //insiatailsising new instances objects for imports are different 
    int totalDaysInMonth = yearMonth.lengthOfMonth();
    int remainingDays = totalDaysInMonth - date.getDayOfMonth();
    return remainingDays;
    }

    public float calculate() {
        return sumOfCredits()- sumOfDebits();
    }

    public static void main(String[] args){
        final String[] creditsAsString = args[0].split (",");// splits the string when a comma is seen into teo string and stored as an array
        final String[] debitsAsString = args[1].split (",");// creditsAsString is of type string that is an array so we put []
    
        final float[] credits = new float[creditsAsString.length];// final means the variable is const 
        final float[] debits = new float[debitsAsString.length];

        for (int i = 0; i<creditsAsString.length; i++ ){   //  loops over the creditsasstring array, i is the eacch index 
        credits[i] = Float.parseFloat(creditsAsString[i]);  // value of index acccessed using naem of array and [i], converts the string in creditsasstring array to float and saved to credit array 
        }

        for (int i=0; i<debitsAsString.length; i++){
        debits[i]= Float.parseFloat(debitsAsString[i]);
        }
    
        final SavingsCalculator calculator= new SavingsCalculator(credits, debits);{ // usign the propertries from the class savingscalculator and making a method that takes them in as parameters
        float netSavings=calculator.calculate();
        System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()));
        
        }
    }
}
    


