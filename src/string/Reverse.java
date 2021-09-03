package string;

public class Reverse {
    public static void main(String[] args) {
        String s = "Thanmay";
        String ans = revStr(s);
        System.out.println(ans);
    }

    private static String revStr(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length / 2; i++) {
            swap(ca, i, ca.length - i - 1);
        }
        return new String(ca);
    }

    private static void swap(char[] ca, int i, int j) {
        char temp = ca[i];
        ca[i] = ca[j];
        ca[j] = temp;
    }
}
