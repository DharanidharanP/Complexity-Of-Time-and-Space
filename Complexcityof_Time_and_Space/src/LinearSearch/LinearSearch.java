package LinearSearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3, 6};
        int target = 3;
        int result = linearSearch(arr, target);
        System.out.println("Target " + target + " found at index: " + result);
    }
}

