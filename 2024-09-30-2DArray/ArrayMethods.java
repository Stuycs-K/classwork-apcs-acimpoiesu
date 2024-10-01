public class ArrayMethods{
  //1. Alexandru Cimpoiesu acimpoiesu60@stuy.edu Matthew Cheng mcheng60@stuy.edu

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrayToString(int[] nums){
  String str = "[";
  for (int i = 0;i<nums.length;i++){
    str+=nums[i];
    if (i<nums.length-1){
      str += ", ";
    }
  }
  return str+"]";
}

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String str = "[";
    for (int i = 0; i < ary.length; i++){
        str += arrayToString(ary[i]);
        if(i<ary.length - 1){
          str+= ", ";
        }
    }
    return str + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j]; 
    }
    }

    return sum;//place holder return value so it compiles.
  }


  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int rows = nums[0].length;
    int columns = nums.length;
    int[][] ArraySwap = new int[rows][columns];
    for (int i = 0; i < columns; i++){
        for (int j = 0; j < rows; j++){
            ArraySwap[j][i] = nums[i][j];
        }
      }
    return ArraySwap;
  }
  public static void main (String[]args){

int[][] array = new int[][]{{10, 20}, {30, 40, 50}, {60}};
int[][] array1 = new int[][]{{100}, {200, 300}, {400, 500, 600}};
int[][] array2 = new int[][]{{0, -1, -2}, {-3, -4, -5}};
int[][] array3 = new int[][]{{1}, {}, {2, 3, 4}, {}};
int[][] array4 = new int[][]{{}, {}};        
int[][] array5 = new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};

int[] ary = new int[]{2, 3, 4, 9};
System.out.println("\n ary as a String: " + arrayToString(ary));
int[] ary1 = new int[]{};
System.out.println("ary2 as a String: " + arrayToString(ary1));


System.out.println("Array 5 as a String:" + arrToString(array5));
System.out.println("Array as a String:" + arrToString(array));
System.out.println("Array 1 as a String:" + arrToString(array1));
System.out.println("Array 2 as a String:" + arrToString(array2));


System.out.println("\n Original Array: " + arrToString(array) + " --> " + arrToString(swapRC(array))); 
// Expected: "{{10, 20}, {30, 40, 50}, {60}} --> {{10, 30, 60}, {20, 40}, {50}}"
System.out.println("Original Array: " + arrToString(array1) + " --> " + arrToString(swapRC(array1))); 
// Expected: "{{100}, {200, 300}, {400, 500, 600}} --> {{100, 200, 400}, {300, 500}, {600}}"
System.out.println("Original Array: " + arrToString(array2) + " --> " + arrToString(swapRC(array2))); 
// Expected: "{{0, -1, -2}, {-3, -4, -5}} --> {{0, -3}, {-1, -4}, {-2, -5}}"
System.out.println("Original Array: " + arrToString(array3) + " --> " + arrToString(swapRC(array3))); 
// Expected: "{{1}, {}, {2, 3, 4}, {}} --> {{1, 2}, {3}, {4}}"
System.out.println("Original Array: " + arrToString(array4) + " --> " + arrToString(swapRC(array4))); 
// Expected: "{{}, {}} --> {{}, {}}"

System.out.println("\nSum of the values in Array: " + arr2DSum(array)); // Expected sum: 210
System.out.println("Sum of the values in Array: " + arr2DSum(array1)); // Expected sum: 2100
System.out.println("Sum of the values in Array: " + arr2DSum(array2)); // Expected sum: -15
System.out.println("Sum of the values in Array: " + arr2DSum(array3)); // Expected sum: 10
System.out.println("Sum of the values in Array: " + arr2DSum(array4)); // Expected sum: 0

  }
}
