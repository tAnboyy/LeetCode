package binarysearch;
//704. Binary Search
public class BS {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 22;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + ( end - start ) / 2;
            if(nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
