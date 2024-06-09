package LinearSearch;

public class Linear_O_n_Time_Complexity {

	 public static boolean linearSearch(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5};
	        System.out.println(linearSearch(myArray, 3)); 
	        System.out.println(linearSearch(myArray, 6));
	    }
	}

