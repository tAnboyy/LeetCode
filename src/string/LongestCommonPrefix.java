package string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"ab", "a"};
        String ans = longestCommonPrefix(s);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] strs) { //TODO: this sol O(n^2) roughly.. try Nick's O(n) sol later

        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < strs[0].length(); i++) {
            char prefixChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1 || strs[j].charAt(i) != prefixChar) return ans.toString();
            }
            ans.append(prefixChar);
        }
        return ans.toString();
    }
}
