package com.pointpark.learnjava;

public class Sandbox {
    public static void main(String[] args) {

        /*
        Author: Brandon $
        Date created: 3/6/19
        Date Modified:
        Description: This is a first time example app of Java
         */

        //Declare variable types
        String vehicle = "Toyota";
        String make = "4Runner";
        String year = "2016";
        String printAcctNumber;
        int accountNumber = 123456;

        //This is my starting method
        System.out.println("Professor Voortman gave us his " + year + " " + vehicle + " " + make);

        //Upper Case Statements
        String uppercase = "ORACLE";
        String lower = uppercase.toLowerCase();
        System.out.println(uppercase + " " + lower);

        //Convert A Number Into A String Value
        printAcctNumber = String.format( "Your converting the acctnumber to a string " + accountNumber);
        System.out.println(printAcctNumber);
    }
}
