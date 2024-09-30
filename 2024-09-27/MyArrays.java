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
  public static int[] returnCopy(int[]ary){
    int [] copyofary = new int [ary.length];
    for (int i = 0; i<ary.length;i++){
      copyofary[i] = ary[i];
    }
    return copyofary;
  }
  public static int[] concatArray(int[]ary1,int[]ary2){
    int [] concatedarr = new int [ary1.length+ary2.length];
    int i = 0;
    int iterator = 0;
    while (i<ary1.length){
      concatedarr[i] = ary1[i];
      i++;
    }
    while (iterator < ary2.length){
      concatedarr[i+iterator] = ary2[iterator];
      iterator++;
    }
    return concatedarr;
  }


  public static void main(String[] args){
    boolean val = true;
    boolean val2 = true;
    int [] arr = {1, 2, 3, 4};
    int [] arr1 = {};
    int [] arr2 = {-1,-2,-3,-4};
    System.out.println("Expected [1, 2, 3, 4], returned:" + arrayToString(arr));
    System.out.println("Expected [], returned:" + arrayToString(arr1));
    System.out.println("Expected [-1, -2, -3, -4], returned:" + arrayToString(arr2));

    int [] copy = returnCopy(arr);
    int [] copy2 = returnCopy (arr2);
    for (int i = 0; i < arr.length;i++){
      if (arr[i] != copy[i]){
        val = false;
      }
    }
    for (int i = 0; i < arr.length;i++){
      if (arr2[i] != copy2[i]){
        val2 = false;
      }
    }
    // Checks if contents equal then if they are the same array
    System.out.println("Contents Equal:" + val);
    if (arr.length > 0) {
    arr[0] = 2;
    }
    System.out.println("Original array:" + arrayToString(arr) +"\nCopied Array" + arrayToString(copy));
    System.out.println("Contents Equal:" + val2);
    if (arr1.length > 0) {
    arr1[0] = 2;
    }
    System.out.println("Original array:" + arrayToString(arr2) +"\nCopied Array" + arrayToString(copy2));

    System.out.println("Array 1:" + arrayToString(arr));
    System.out.println ("Array 2:" + arrayToString(arr1));
    System.out.println ("Combined array" + arrayToString(concatArray(arr,arr1)));

    int [] arr3 = {0, 0, 0};
    System.out.println("Array 1:" + arrayToString(arr2));
    System.out.println ("Array 2:" + arrayToString(arr3));
    System.out.println ("Combined array" + arrayToString(concatArray(arr2,arr3)));

  }
}
