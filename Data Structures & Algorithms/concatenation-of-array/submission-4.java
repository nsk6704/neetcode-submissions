class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int[] newNums = new int[n*2];

        for (int i = 0; i < n; i++){
            newNums[i] = nums[i];
            newNums[i + n] = nums[i];
        }

        return newNums;
    }
}