package masters.algorithm.algorithm02;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int num1, num2;
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                num2 = nums[j];
                if (num1 + num2 == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}