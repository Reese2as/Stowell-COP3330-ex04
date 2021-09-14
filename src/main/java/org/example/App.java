/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String noun, verb, adjective, adverb;
        
        System.out.print("Enter a noun ");
        noun = user_input.next();
        System.out.print("Enter a verb ");
        verb = user_input.next();
        System.out.print("Enter a adjective ");
        adjective = user_input.next();
        System.out.print("Enter a adverb ");
        adverb = user_input.next();
        
        System.out.println(String.format("Do you %s her %s %s %s? you're a goofy guy.", verb, adjective, noun, adverb));
    }
}
