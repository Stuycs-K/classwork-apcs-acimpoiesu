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
  public static void main(String[] args) {
    System.out.println(countNoDoubleLetterWords(2,"", "abc"));
  }
}
