public class Stars_v1 {
    public static void main(String[] args) {
        lineOfx(13);
        lineOfx(7);
        lineOfx(35);
    }

    public static void lineOfx(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }       