package sorting;
//169. Majority Element
import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    private static int majorityElement(int[] arr) {

        if(arr.length == 1) return arr[0];

        int num = arr.length / 2;
        int ans = 0;
        Arrays.sort(arr);
        int locCnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                locCnt = 0;
            }
            locCnt++;
            if(locCnt > num){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
}
