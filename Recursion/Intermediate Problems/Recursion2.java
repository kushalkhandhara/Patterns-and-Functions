// Check Wheather the array is in incresing Order or not

public class Recursion2 {
    public static boolean AscendingOrder(int arr[], int i) {
        // Base case: if we have reached the last element, check if it's less than the next one
        if (i == arr.length - 1) {
            // Since we cannot compare arr[i] with arr[i+1], assume it's in ascending order
            return true;
        } 
        
        if (arr[i] < arr[i + 1]) {
            // Recursive call with incremented index
            return AscendingOrder(arr, i + 1);
        }
         else {
            // If arr[i] is not less than arr[i+1], it's not in ascending order
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        boolean a = AscendingOrder(arr, 0);
        if (a) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
// Why To Write Return At the end?

// Without the recursive call: After checking the first pair of elements (arr[i] and arr[i + 1]), the method would simply return false if arr[i] is not less than arr[i + 1]. It would never reach the last element of the array to perform the final comparison needed to determine if the entire array is in ascending order.

// Incorrect results: The method would incorrectly report that the array is not in ascending order even if it is, because it stops checking after the first pair where the elements are not in ascending order, without considering the rest of the array.

// No termination condition: Without the recursive call, there would be no mechanism to eventually terminate the recursion and return a result indicating whether the entire array is in ascending order. The method would keep trying to execute the same block of code indefinitely, leading to a stack overflow error at runtime.