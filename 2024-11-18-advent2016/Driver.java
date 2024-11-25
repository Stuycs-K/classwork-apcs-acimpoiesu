import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver{
  public static int Distance(String filename){
    try {
        int dir = 0;
        int [] blocks = new int [4];
        File file = new File(filename);
        Scanner input = new Scanner(file);
        String line = input.nextLine();
        String [] dirs = line.split(", ");
        for (int i = 0; i<dirs.length; i++){
          if (dirs[i].substring(0,1).equals("R")){
            dir = (dir + 1) % 4;
          }
          else{
            dir = (dir + 3) % 4;
          }
          blocks[dir] += Integer.parseInt(dirs[i].substring(1));
        }
        return Math.abs(blocks[0] - blocks[2]) + Math.abs(blocks[1] - blocks[3]);
  }
  catch(Exception e){
    return 0;
}
  }
      public static void main(String[] args) {
      System.out.println(Distance("file.txt"));
    }
      }
