package com.h2;

public class Utilities {
   public static long getLongValue(String in){
    Long out= Long.MIN_VALUE;
    try{
        Long.parseLong(in)=out;

    }catch (NumberFormatException e){

    }catch (IllegalArgumentException(in + " cannot be converted into a 'long' value. Exiting program."))
                return out;
}
}

