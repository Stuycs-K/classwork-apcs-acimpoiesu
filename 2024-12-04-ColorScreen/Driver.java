import java.util.Arrays;
public class Driver{
    public static void drawBorder(){
        for(int i = 0; i<80; i++){
            Text.go(1, i+1);
            Text.color(Text.background(Text.BLUE));
            System.out.print("*");

            Text.go(30, i + 1);
            System.out.print("*");
        }
        for (int i = 2; i<30;i++){
            Text.go(i, 1);
            System.out.print("*");

            Text.go(i, 80);
            System.out.print("*");
        }
        }
    public static int[] genranarry(){
        int [] rannums = new int [3];
        for(int i = 0; i < 3; i++){
            rannums[i] = (int) (Math.random() * 100);
        }
        return rannums;
    }
    public static void placerannums(int[]nums){
        for(int i = 0; i<3;i++){
            go(2,20*i + 20);
            if
        }
    }
    public static void main(String[] args) {
        drawBorder();
        System.out.print(Text.RESET);
        System.out.println(Arrays.toString(genranarry()));
    }
}