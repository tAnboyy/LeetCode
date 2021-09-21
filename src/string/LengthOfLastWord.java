package string;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy  ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }

    static public int lengthOfLastWord(String s) {
        int size = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && size != 0) {
                break;
            } else if (s.charAt(i) != ' ') {
                size++;
            }
        }
        return size;
    }
}
