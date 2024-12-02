public class OddHw {
    public static boolean odd(boolean a, boolean b, boolean c) {
        int count = 0;
        if (a) count++;
        if (b) count++;
        if (c) count++;
        return count %2 != 0;
    }
    public static void main(String[] args) {
        System.out.println(odd(true, true, false));
        System.out.println(odd(true, true, true));
        System.out.println(odd(false, false, false));
    }
}