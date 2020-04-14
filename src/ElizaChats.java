/*
ElizaChats is a online chat room that supports individuals that need emotional support. Create an application that
 */

import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        // prompts for username
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");

        // receive username & assign it to a variable
        String name = input.nextLine();

        // greeting
        System.out.println("Nice to meet you, " + name + ", How has your day been?");

        // receive first response after name
        String first_response = input.nextLine();

        // request user based on the given reply
        System.out.println("Okay, Anything in particular that makes you feel that " + first_response + " ?");

        // receive second response
        String second_response = input.nextLine();

        // make good wish and good bye
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");

        // display the result
        System.out.println("\n\nHere are your responses: " + name + " " + first_response + " " + second_response);


    }

}
