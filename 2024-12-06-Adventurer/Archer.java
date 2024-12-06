import java.util.Random;
public class Archer extends Adventurer{
  private String SpecialName = "Arrows";
  private int SpecialAmt = 0;

  public String getSpecialName(){
    return SpecialName;
  }
  public int getSpecial(){
    return SpecialAmt;
  }
}
