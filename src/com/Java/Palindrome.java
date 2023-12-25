package com.Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("""
                Palindrome Check!
                Please Enter your word:
                """);
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        String input1, input2 = "";
        if (input.length() > 1){
            input1 = input.substring(0,input.length()/2);
            //System.out.println("input1: "+input1);
            for(int i=input.length()-1;i>=(input.length()/2);i--){
                input2 += input.charAt(i);
                //System.out.println("input2: "+input2);
            }
            if(input1.equalsIgnoreCase(input2)) {
                System.out.println("""
                        The word is Palindrome!
                        """);
                System.exit(0);
            }
        }
        System.out.println("""
                        The word in not-Palindrome!
                        """);
    }
}
