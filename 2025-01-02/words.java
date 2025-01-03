public class words{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters < 1){
      System.out.println(result);
    }
    for(int i = 0; i < alphabet.length(); i++){
      makeWords(remainingLetters - 1, result += alphabet.charAt(i), alphabet);
    }
  }
  public static void main(String[] args) {
    makeWords(2, "", "ab");
  }
}
