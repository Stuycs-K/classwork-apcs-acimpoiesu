public class ArrayMethods {
    // 1. Alexandru Cimpoiesu acimpoiesu60@stuy.edu Matthew Cheng mcheng60@stuy.edu

    // 2. Copy your arrToString method from before.
    /**Return a String that represents the array in the format:
    * "[2, 3, 4, 9]"
    * Note the comma+space between values, and between values
    */
    public static String arrayToString(int[] nums) {
        String str = "[";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
            if (i < nums.length - 1) {
                str += ", ";
            }
        }
        return str + "]";
    }

    // 3. Write arrToString, with a 2D array parameter.
    /**Return a String that represents the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    */
    public static String arrToString(int[][] ary) {
        String str = "[";
        for (int i = 0; i < ary.length; i++) {
            str += arrayToString(ary[i]);
            if (i < ary.length - 1) {
                str += ", ";
            }
        }
        return str + "]";
    }

    public static int arr2DSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;
    }

    /** Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
    public static int[][] swapRC(int[][] nums) {
        int rows = nums.length; // Number of rows in the input array
        int columns = nums[0].length;
        int[][] swappedArray = new int[columns][rows]; 

        // Perform the row-column swap
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                swappedArray[j][i] = nums[i][j]; // Swap the elements
            }
        }

        return swappedArray; // Return the swapped array
    }

    public static void main(String[] args) {
      int[][] array = new int[][]{{10, 20, 30}, {40, 50, 60}};
      int[][] array1 = new int[][]{{100, 200}, {300, 400}};
      int[][] array2 = new int[][]{{0, -1, -2}, {-3, -4, -5}};
      int[][] array5 = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

      int[] ary = new int[]{2, 3, 4, 9};
      System.out.println("\nary as a String: " + arrayToString(ary));
      int[] ary1 = new int[]{};
      System.out.println("ary1 as a String: " + arrayToString(ary1));

      System.out.println("Array 5 as a String: " + arrToString(array5));
      System.out.println("Array as a String: " + arrToString(array));
      System.out.println("Array 1 as a String: " + arrToString(array1));
      System.out.println("Array 2 as a String: " + arrToString(array2));

      System.out.println("\nOriginal Array: " + arrToString(array) + " --> " + arrToString(swapRC(array)));
      System.out.println("Original Array: " + arrToString(array1) + " --> " + arrToString(swapRC(array1)));
      System.out.println("Original Array: " + arrToString(array2) + " --> " + arrToString(swapRC(array2)));
      System.out.println("Original Array: " + arrToString(array5) + " --> " + arrToString(swapRC(array5)));

      System.out.println("\nSum of the values in Array: " + arr2DSum(array)); // Expected sum: 210
      System.out.println("Sum of the values in Array: " + arr2DSum(array1)); // Expected sum: 1000
      System.out.println("Sum of the values in Array: " + arr2DSum(array2)); // Expected sum: -15
      System.out.println("Sum of the values in Array: " + arr2DSum(array5)); // Expected sum: 54
    }
}