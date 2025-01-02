public class fibNum{
  public static int fibNums(int n){
    if (n < 2){
      return n;
    }
    return fibNums(n - 1) + fibNums (n - 2);
  }
  public static void main(String[] args) {
    System.out.println(fibNums(3));
  }
}
