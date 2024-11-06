import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt")); 
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
  }
  file.close();
  } catch (FileNotFoundException e) {
  System.out.println("File not found: " + filename);
  }
  return count;
  }


  public static boolean isTrig (int[] sides){
    int max = 0;
    int second = 0;
    int min = 0;
    for(int i =0; i < 3; i++){
      if(sides[i] > max){
        second = max;
        max = sides[i];
      }
      else if (sides[i] > second){
        min = second;
        second = sides[i];
      }
      else{
        min = sides[i];
      }
    }
    return (sides[1] + sides[2] > sides[0]);
  }
}
