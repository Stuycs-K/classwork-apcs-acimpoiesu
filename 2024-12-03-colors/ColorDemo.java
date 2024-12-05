public class ColorDemo{
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static final String HIDE_CURSOR = "\u001b[?25l";
    public static final String SHOW_CURSOR = "\u001b[?25h";
    public static final String RESET = "\u001b[0m";
    public static void go(int row, int col) {
        System.out.print("\u001b[" + row + ";" + col + "H");
    }
    public static void color(int foreground, int background) {
        String sequence = ("\u001b[" + foreground + ";" + (background + 10));
        sequence+= "m";
        System.out.print(sequence);
    }
    public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
}
    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN + HIDE_CURSOR);
        int rows = 20, cols = 50;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                go(row, col);
                int fg = 30 + (row % 8);
                int bg = 40 + (col % 8);
                color(fg, bg);
                System.out.print(" ");
            }
        }
        sleep(1000);
        System.out.print(CLEAR_SCREEN);
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                go(row, col);
                int fg = 90 + (row % 8);
                int bg = 100 + (col % 8);
                color(fg, bg);
                System.out.print(" ");
            }
        }
        System.out.print(RESET + SHOW_CURSOR);
    }
}
