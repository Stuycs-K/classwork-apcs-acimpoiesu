import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    CodeWarrior p1 = new CodeWarrior ("p1", 25, "C");
    CodeWarrior p2 = new CodeWarrior ("p2", 26, "java");
    Scanner userInput = new Scanner(System.in);
    System.out.println(p1.getName() + " "+ p1.getHP() + " " + p1.getSpecialName());
    System.out.println(p2.getName() + " "+ p2.getHP() + " " + p2.getSpecialName());
    while (p1.getHP()> 0 && p2.getHP()> 0){
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String input = userInput.nextLine();
    if(input == "a" || input == "attack"){
      p1.attack(p2);
    }
  }
  }
}