public class For {
    public static void main(String[] args){
        for (int i = 1; i <= 1000; ) {
            System.out.println("Before: " + i);
            i *= 10;
            System.out.println("After: " + i);
        }
    }
}
