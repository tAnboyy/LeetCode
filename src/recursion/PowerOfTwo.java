package recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1;
        boolean ans = isPowof2(n);
        System.out.println(ans);
    }

    private static boolean isPowof2(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
