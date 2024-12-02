public class AreTriangularHw {
    public static boolean areTriangular(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && ( c + a > b);
    }
    public static void main(String[] args) {
        System.out.println(areTriangular(2.6, 4.5, 7.0));
        System.out.println(areTriangular(10.5, 5.0, 30.8));
        System.out.println(areTriangular(8.3, 1.0, 25.0));
    }
}
