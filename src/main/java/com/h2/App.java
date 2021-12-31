package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return 2 * number;
    }

    private static int add(int[] numbers){ // returns number as an int array 
    var sum = 0;// var automatically recognises the data type
    for (int number:numbers) { // for the array called numbers each individual array called number 
        sum += number; // add all number up and make it equal to sum
    } 
            
    return sum; // outputs sum
}}    