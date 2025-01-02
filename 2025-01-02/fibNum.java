public class fibNum{
  public int fibNums(int n){
    if (n < 2){
      return n;
    }
    return fibNums(n - 1) + fibNums (n - 2);
  }
}
