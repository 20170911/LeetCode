package day3;

/**
 * 66.加一
 */
public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{9,9,9};
        nums = plusOne(nums);
        for (int num:nums){
            System.out.print(num);// 1000
        }
    }

    private static int[] plusOne(int[] digits){

        for (int i = digits.length-1; i >= 0; i--){
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
