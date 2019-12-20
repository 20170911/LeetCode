package day1;

/**
 * 题目：删除排序数组中的重复项
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(arr));
        // 执行结果：3
    }

    private static int removeDuplicates(final int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                if (j - i > 1) {
                    nums[i + 1] = nums[j];
                }
                i++;
            }
            j++;
        }

        return i + 1;
    }
}
