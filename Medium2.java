/*
 Medium 2 

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109

 */


import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Import Statements

public class Medium2 {     //Created a class 
    public static void main(String[] args) {   //Main function
        Scanner sc = new Scanner(System.in);   //Taking input from the user and creating scanner class

        System.out.println("Enter the size of the array:");   //// Prompt the user to enter the size of the array
        int size = sc.nextInt();    //User enters the size of the array
        int[] nums = new int[size]; // Initialize an array to store user input

        System.out.println("Enter the elements of the array:"); // Prompt the user to enter the elements of the array
        for (int i = 0; i < size; i++) { //For loop
            nums[i] = sc.nextInt(); // Read each element and store it in the array
        }

        List<Integer> result = majorityElem(nums);  // Call the majorityElem method to find elements appearing more than ⌊ n/3 ⌋ times

        System.out.println("Elements appearing :" + result); // Print the elements appearing more than ⌊ n/3 ⌋ times
    }

    private static List<Integer> majorityElem(int[] nums) { // Method to find elements appearing more than ⌊ n/3 ⌋ times
        List<Integer> result = new ArrayList<>(); //Initialize Integer ArrayList
        int n = nums.length; //Length of the array

         // If the array is empty, return an empty result list
        if (n == 0) {
            return result;
        }

        Map<Integer, Integer> countMap = new HashMap<>(); // Create a HashMap to store the count of each unique element in the array

        // Count the occurrences of each element in the array
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int threshold = n / 3; // Set the threshold for elements to be considered as majority elements

        // Iterate through the entries in the countMap
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            // If the count of an element is greater than the threshold, add it to the result list
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;  // Return the list of majority elements
    }
}