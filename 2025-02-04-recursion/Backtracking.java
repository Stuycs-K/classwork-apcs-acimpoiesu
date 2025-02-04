public class Backtracking{
  public static long countNoDoubleLetterWords(int length,String word, String letters){
    for (int i = 0; i < letters.length; i++){
      word+= letters.charAt(i);
      countNoDoubleLetterWords(length - 1, word, letters);
    }
  }
  public static void main(String[] args) {

  }
}
