public class MajorityHw {
    public static boolean majority(boolean a, boolean b, boolean c) {
        int count = (a ? 1 : 0) + (b ? 1 : 0) + (c? 1 : 0);
        return count >= 2;
    }
    public static void main(String[] args) {
        System.out.println(majority(true, false, false));
        System.out.println(majority(true, true, true));
        System.out.println(majority(false, false, false));
    }
}