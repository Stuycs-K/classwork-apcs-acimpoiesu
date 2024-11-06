import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class TriangleTester{
  public static void main(String[] args){
    //System.out.println(countTrianglesA("inputTri.txt")); 
    System.out.println(countTrianglesB("inputTri.txt")); 
  }
  public static int countTrianglesB(String filename) {
    ArrayList<Integer> column1 = new ArrayList<>();
    ArrayList<Integer> column2 = new ArrayList<>();
    ArrayList<Integer> column3 = new ArrayList<>();
    int count = 0;
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        if (parts.length == 3) {
          column1.add(Integer.parseInt(parts[0]));
          column2.add(Integer.parseInt(parts[1]));
          column3.add(Integer.parseInt(parts[2]));  
        }
      }
      scanner.close();
      for (int i = 0; i+2 < column1.size(); i++) {
        int[] sides1 = {column1.get(i), column1.get(i + 1), column1.get(i + 2)};
        if (isTrig(sides1)) {
          count++;
        }
        int[] sides2 = {column2.get(i), column2.get(i + 1), column2.get(i + 2)};
        if (isTrig(sides2)) {
          count++;
        }
        int[] sides3 = {column3.get(i), column3.get(i + 1), column3.get(i + 2)};
        if (isTrig(sides3)) {
          count++;
        }
      }
      } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filename);
      }
      return count;
    }

  public static int countTrianglesA(String filename){
    int[] sides = new int[3];
    int count = 0;
    try {
    File fille = new File(filename);
    Scanner file = new Scanner(fille);
    while(file.hasNextLine()){
      int index = 0;
      while(file.hasNextInt() && index < 3){
        sides[index] = file.nextInt();
        index ++;
        }
      if(index == 3 && isTrig(sides)){
        count ++;
      }
      sides = new int[3];
      if (file.hasNextLine()) {
      file.nextLine();
      }
  }
  file.close();
  } catch (FileNotFoundException e) {
  System.out.println("File not found: " + filename);
  }
  return count;
  }


  public static boolean isTrig (int[] sides){
  return ((sides[0] + sides[1] > sides[2]) &&
  (sides[0] + sides[2] > sides[1]) &&
  (sides[1] + sides[2] > sides[0]));
}
}