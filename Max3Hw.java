public class Max3Hw {
    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static double max3(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        System.out.println("The maximum (int) is: " + max3(15, 4, 8));
        System.out.println("The maximum (double) is: " + max3(15.8, 4.3, 8.6));
    }
}
