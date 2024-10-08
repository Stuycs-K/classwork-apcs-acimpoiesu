import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] test1= new int [][]{{1,2,3,4}, {0,1,2}, {1,0,0,0}};
    System.out.println("Built in function" + Arrays.deepToString(test1) + "My function" + arrToString(test1));
    System.out.println("Expected 4, Result:" +countZeros2D(test1));
    if (htmlTable(test1).equals("<table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr><tr><td>0</td><td>1</td><td>2</td></tr><tr><td>1</td><td>0</td><td>0</td><td>0</td></tr></table>")){
      System.out.println("Test passed");
    }
    int[][] test2 = {{1, 2, 3}, {4, 5, 6}};
    System.out.println("Expected 0, Result: " + countZeros2D(test2));
    if (htmlTable(test2).equals("<table><tr><td>1</td><td>2</td><td>3</td></tr><tr><td>4</td><td>5</td><td>6</td></tr></table>")) {
    System.out.println("Test passed");
    int[][] test3 = {};
    System.out.println("Expected 0, Result: " + countZeros2D(test3));
    if (htmlTable(test3).equals("<table></table>")) {
      System.out.println("Test passed");
    }
  }
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] nums) {
      String str = "[";
      for (int i = 0; i < nums.length; i++) {
          str += nums[i];
          if (i < nums.length - 1) {
              str += ", ";
          }
      }
      return str + "]";
  }
  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] ary) {
      String str = "[";
      for (int i = 0; i < ary.length; i++) {
          str += arrToString(ary[i]);
          if (i < ary.length - 1) {
              str += ", ";
          }
      }
      return str + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i<nums.length;i++){
      for (int j = 0; j<nums[i].length;j++){
        if (nums[i][j]==0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][] nums) {
       int sum = 0;
       for (int i = 0; i < nums.length; i++) {
           for (int j = 0; j < nums[i].length; j++) {
               sum += nums[i][j];
           }
       }
       return sum;
   }
  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals){
  for (int i = 0; i<vals.length;i++){
    for(int j = 0; j<vals[i].length;j++){
      if (0>vals[i][j]){
        vals[i][j]=0;
        if(i == j){
          vals[i][j]=1;//replaces equal column and row number with 1
        }
      }
    }
  }
  return vals;
}
  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[]copy(int[] nums){
      int [] cpyarr = new int [nums.length];
      for(int i = 0; i<nums.length;i++){
          cpyarr[i] = nums[i];
      }
      return cpyarr;
  }
  public static int[][] copy(int[][] nums){
    int[][] cpyarr = new int[nums.length][];
      for (int i = 0; i < nums.length; i++) {
          cpyarr[i] = copy(nums[i]);
      }
      return cpyarr;
  }
  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums) {
      int rows = nums.length; // Number of rows in the input array
      int columns = nums[0].length;
      int[][] swappedArray = new int[columns][rows];
      // Performs the row-column swap
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              swappedArray[j][i] = nums[i][j]; // Swaps the elements
          }
      }
      return swappedArray; // Returns the swapped array
    }
  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String table = "<table>";
    for (int i = 0; i<nums.length;i++){
      table += "<tr>";
      for (int j = 0; j<nums[i].length;j++){
        table += ("<td>" + nums[i][j] + "</td>");
      }
      table += "</tr>";
    }
    return table += "</table>";
  }
}
