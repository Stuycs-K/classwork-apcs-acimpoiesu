import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class messagedecoder {

    public static String decodeMessage(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            String firstLine = input.nextLine();
            int length = firstLine.length();
            int[][] frequencies = new int[length][26];
            for (int i = 0; i < length; i++) {
                frequencies[i][firstLine.charAt(i) - 'a']++;
            }
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < length; i++) {
                    frequencies[i][line.charAt(i) - 'a']++;
                }
            }
            input.close();
            String correctmessage = "";
            for (int j = 0; j < length; j++) {
                int maxFreq = 0;
                char mostfreq = ' ';
                for (int i = 0; i < 26; i++) {
                    if (frequencies[j][i] > maxFreq) {
                        maxFreq = frequencies[j][i];
                        mostfreq = (char) (i + 'a');
                    }
                }
                correctmessage += mostfreq;
            }
            return correctmessage;
        } 
        catch (FileNotFoundException e) {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("file.txt"));
    }
}
