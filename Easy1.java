
/*
Easy 1

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring consisting of non-space characters only.

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.

 */
     


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//Import statements

public class Easy1 {  //Start of a class named Easy1
    public static void main(String[] args) {  //Beginning of the main function
        Scanner sc = new Scanner(System.in);  //Taking input from the user

        System.out.println("Enter a sentence:"); //Asking the user to enter the sentence
        String input = sc.nextLine().trim();       //Reads a line of input from the user using the Scanner, stores it in a String variable input, and trims any leading or trailing whitespaces.

        int lw = Lastword(input);  //Calls the LastWord method with the user input and stores the result in the variable lw.

        System.out.println("Length of the last word: " + lw);  //Print the lastword
    }

    private static int Lastword(String s) {    //Create a function called LastWord
        if (s == null || s.isEmpty()) {  //Checks if the input string is null or empty. If Yes, returns 0, indicating that there is no last word.
            return 0;
        }

        String[] words = s.split("\\s+");  //Splits the input string into an array of words using the regular expression "\s+" as the delimiter
        if (words.length == 0) {  //Checks if the array of words is empty. If so, returns 0, indicating that there is no last word.
            return 0;
        }

        return words[words.length - 1].length();  //Returns the length of the last word in the array of words.
    }   //Closes the function named lastword
}       //Closes the main function

