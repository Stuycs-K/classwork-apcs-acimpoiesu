import java.util.Random;
public class Archer extends Adventurer{
  private String SpecialName = "Arrows";
  private int SpecialAmt = 0;
  private int SpecialMax = 999;

  public String getSpecialName(){
    return SpecialName;
  }
  public int getSpecial(){
    return SpecialAmt;
  }
  public void setSpecial(int n){
    if(n < getSpecialMax()){
    SpecialAmt = n;
  }
  }
  public int getSpecialMax(){
    return SpecialMax;
  }
  public String attack(Adventurer other){
    other.applyDamage(20);
    return "Attacked";
  }
  public String support(Adventurer other){
    other.setmaxHP(100);
    return "Healed " + other.getSpecialName();
  }
  public String support(){
    this.setHP(100);
    return "Healed self";
  };
  public abstract String specialAttack(Adventurer other);
}
