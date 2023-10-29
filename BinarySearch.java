public class BinarySearch {
    // Recursive binary search method
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            }

            if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right); // Search the right half
            } else {
                return binarySearch(arr, target, left, mid - 1); // Search the left half
            }
        }

        return -1; // Element not found
    }

    // Main method to test the binary search
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
