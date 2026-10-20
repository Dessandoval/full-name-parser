package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a Java application called full-name-parser that prompts the user to enter a
        // name in one of the following two formats:
        //first last or first middle last
        System.out.print("Please enter your first and last name:  ");
        String userFirstLastName = scanner.nextLine();

        userFirstLastName = userFirstLastName.trim();
        System.out.println(userFirstLastName);

        //Make sure to trim the name before proceeding in case the user entered leading or
        //trailing spaces.
        //Parse the name and process it so that you can display the individual pieces of the name.
        //A sample trace of your program output is shown below. Bolded code is what the user
        //entered.

    }
}
