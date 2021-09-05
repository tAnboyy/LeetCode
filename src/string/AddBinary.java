package string;

public class AddBinary {
    public static void main(String[] args) {
        String s1 = "0";
        String s2 = "0";
        String ans = addBinary(s1, s2);
        System.out.println(ans);
//        System.out.println(Character.getNumericValue('2'));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += Character.getNumericValue(a.charAt(i));
            if (j >= 0) sum += b.charAt(j) - '0'; // - '0' not +, converts char to int
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
