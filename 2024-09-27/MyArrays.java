public class MyArrays{
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
  public static void main(String[] args){
    boolean val = true;
    boolean val1 = true;
    int [] arr = {1, 2, 3, 4};
    int [] arr1 = {};
    int [] arr2 = {-1,-2,-3,-4};
    System.out.println("Expected [1, 2, 3, 4], returned:" + arrayToString(arr));
    System.out.println("Expected [], returned:" + arrayToString(arr1));
    System.out.println("Expected [-1, -2, -3, -4], returned:" + arrayToString(arr2));

    int [] copy = returnCopy(arr);
    int [] copy1 = returnCopy (arr1);
    for (int i = 0; i < arr.length;i++){
      if (arr[i] != copy[i]){
        val = false;
      }
    }
    for (int i = 0; i < arr.length;i++){
      if (arr1[i] != copy1[i]){
        val1 = false;
      }
    }
    // Checks if contents equal then if they are the same array
    System.out.println("Contents Equal:" + val);
    arr[0] = 2;
    System.out.println("Original array:" + arrayToString(arr) +"\nCopied Array" + arrayToString(copy));
    System.out.println("Contents Equal:" + val1);
    arr1[0] = 2;
    System.out.println("Original array:" + arrayToString(arr1) +"\nCopied Array" + arrayToString(copy1));

    System.out.println("Array 1:" + arrayToString(arr));
    System.out.println ("Array 2:" + arrayToString(arr1));
    System.out.println ("Combined array" + concatArray(arr,arr1));

    int [] arr3 = {0, 0, 0};
    System.out.println("Array 1:" + arrayToString(arr2));
    System.out.println ("Array 2:" + arrayToString(arr3));
    System.out.println ("Combined array" + concatArray(arr2,arr3));

  }
}
