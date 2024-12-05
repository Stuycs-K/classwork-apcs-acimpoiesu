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
    public static void main(String[] args) {
        drawBorder();
    }
}