/*
Create a method that takes a string and returns the word count. The string will be a sentence.

        Examples
        countWords("Just an example here move along") ➞ 6

        countWords("This is a test") ➞ 4

        countWords("What an easy task, right") ➞ 5
 */

import java.util.Scanner;
//Similar to include?

public class Main {
    // First ever Java program, so we'll learn as we go.
    // Classes are the primary unit of organization in Java, seemingly.
    public static void main(String[] args) { //Entry point, == main function in c++. You can call this method directly
        // to start the program, which is how it can have arguments.
        // Public means that this method can be called from other classes or packages. What's a package?
        // Static means it belongs to the class, not an instance.

        System.out.println("Hello! Please input your phavorite phrase: ");
        // Okay, console input is different. We start by importing the Scanner utility.
        // Then we create an instance of the Scanner class. We pass in System.in as a parameter.
        Scanner scanner = new Scanner(System.in);
        // Now we can actually get input from the user using the nextLine() function of the Scanner class.
        // We need to split the input my using the split method of the nextLine function.
        String[] favoritePhrase = scanner.nextLine().split(" ");
        // And to finish, we have to actually close the Scanner class. I thought Java was supposed to have
        // great automatic garbage handling.
        scanner.close();
        // Now we can output the length.
        System.out.println("The number of words in your flavorite phrase is: " + favoritePhrase.length);
    }
}