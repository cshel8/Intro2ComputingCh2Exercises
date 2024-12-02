import java.util.Arrays;
public class MethodEqHw {
    public static boolean eq(int[] array1, int[] array2){
        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
       int[] array1 = {1, 2, 3};
       int[] array2 = {1, 2, 3};
       int[] array3 = {1, 2, 4};
       int[] array4 = {1, 2};
        System.out.println(eq(array1, array2));
        System.out.println(eq(array1, array3));
        System.out.println(eq(array1, array4));
    }
}
