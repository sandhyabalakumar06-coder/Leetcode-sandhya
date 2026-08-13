// Last updated: 8/13/2026, 3:44:22 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum+ nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}