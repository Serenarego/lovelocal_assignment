
/*
Hard 3

Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n. 

Constraints:
0 <= n <= 109
 */


import java.util.Scanner;    //import statement

public class Hard3 {    //Creating a class 
    public static void main(String[] args) {  //Beginning of the main function
        Scanner sc = new Scanner(System.in);  //Taking input from the user and creating scanner class
        int n = sc.nextInt(); //Read an integer from the users input
        int ans = countOnesInRange(n); // Call the countOnesInRange method to calculate the count of digit '1' in the range [0, n]
        System.out.println(ans); // Print the result as output
    }

    // Method to calculate the count of digit '1' in the range [0, n]
    private static int countOnesInRange(int n) {
        int count = 0; //Initialize the variable to 0

        // Iterate through each decimal place in the numbers from 1 to n
        for (int i = 1; i <= n; i *= 10) {
            // Update the count based on the number of times digit '1' appears at the current decimal place
            count += (n / i + 8) / 10 * i + Math.min(Math.max(0, n % i - i + 1), i);
        }

        // Return the final count of digit '1' in the range [0, n]
        return count;
    }
}