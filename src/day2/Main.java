package day2;

/**
 * 189.旋转数组
 */
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num);
        }
    }

    private static void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
