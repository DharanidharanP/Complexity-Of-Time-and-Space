package BinarySearch;

public class Binary_O_logn {  // Average time complexity

	    public static int binarySearch(int[] array, int target) {
	        int low = 0;
	        int high = array.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (array[mid] == target) {
	                return mid;
	            } else if (target < array[mid]) {
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
	        int target = 11;
	        int index = binarySearch(array, target);
	        if (index != -1) {
	            System.out.println("Element " + target + " found at index " + index);
	        } else {
	            System.out.println("Element " + target + " not found");
	        }
	    }
}
	

