package string;

public class ImplementstrStr {
    public static void main(String[] args) {
        String s = "";
        String target = "";
        int ans = strStr(s, target);
        System.out.println(ans);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
