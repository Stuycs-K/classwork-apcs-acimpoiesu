public class Backtracking{

  public static long countNoDoubleLetterWords(int length,String word, String letters){
    if (length == 0){
      return 1;
    }
    long counter = 0;
    for (int i = 0; i < letters.length(); i++){
      if (word.length() == 0 || letters.charAt(i) != word.charAt(word.length() -1)){
       counter += countNoDoubleLetterWords(length - 1, word+letters.charAt(i), letters);
      }
    }
    return counter;
  }

  public static boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length){
      return target == 0;
    }
    if(groupSum(start + 1 , nums, target - nums[start])){
      return true;
    }
    if(groupSum(start + 1 , nums, target)){
      return true;
    }
    return false;
  }

  public static boolean splitArray(int[] nums) {
    if (index > nums.length){
      return sum1 == sum2;
    }
    if (splitArray(nums, index + 1, sum1 + nums[index], sum2)){
      return true;
    }
    if (splitArray(nums, index + 1, sum1, sum2 + nums[index])){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(countNoDoubleLetterWords(2,"", "abc"));
    System.out.println(groupSum(0,new int[]{1,2,3,4}, 6));
    System.out.println(splitArray(new int []{1,2,3,4}))
  }
}
