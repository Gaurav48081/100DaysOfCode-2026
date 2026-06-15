// Day 2
// Problem: Largest Element in an Array
// Approach: Iterative Linear Scan

class Solution {
    public static void main(String[] args) {
        int[] array = {3, 7, 9, 2, 5};
        int largest = findLargest(array);
        System.out.println("Largest element: " + largest); // Output: 9
    }

    public static int findLargest(int[] arr) {
        // Start by assuming the first element is the largest
        int max = arr[0];
        
        // Loop through the rest of the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than our current max
            if (arr[i] > max) {
                // Update the max
                max = arr[i];
            }
        }
        
        return max;
    }
}
