package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a Java application called full-name-parser that prompts the user to enter a
        // name in one of the following two formats:
        //first last or first middle last
        System.out.print("Please enter your first and or middle and last name: ");
        String input = scanner.nextLine().trim();

        String[] userNameFormat = input.split(" ");

        String first = userNameFormat[0];
        String middle;
        String last;

        if (userNameFormat.length == 3){
            middle = userNameFormat[1];
            last = userNameFormat[2];
        } else {
            middle = "(none)";
            last = userNameFormat[1];
        }

        System.out.println("First Name: " + first);
        System.out.println("Middle Name: " + middle);
        System.out.println("Last Name: " + last);
        //Make sure to trim the name before proceeding in case the user entered leading or
        //trailing spaces.
        //Parse the name and process it so that you can display the individual pieces of the name.
        //A sample trace of your program output is shown below. Bolded code is what the user
        //entered.

    }
}
