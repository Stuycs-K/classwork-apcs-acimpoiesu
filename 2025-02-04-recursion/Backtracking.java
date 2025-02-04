public class Backtracking{
  static int counter = 0;
  public static long countNoDoubleLetterWords(int length,String word, String letters){
    if (length == 0){
      counter++;
    }
    for (int i = 0; i < letters.length(); i++){
      word+= letters.charAt(i);
      if (letters.charAt(i) != word.charAt(word.length() -1)){
      countNoDoubleLetterWords(length - 1, word, letters);
      }
    }
    return (long) counter;
  }
  public static void main(String[] args) {
    System.out.println(countNoDoubleLetterWords(2,"", "abc"));
  }
}
