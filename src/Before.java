public class Before {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 1000) {
            System.out.println("Before: " + i);
            i *= 10;
            System.out.println("After: " + i);
        }
    }
}