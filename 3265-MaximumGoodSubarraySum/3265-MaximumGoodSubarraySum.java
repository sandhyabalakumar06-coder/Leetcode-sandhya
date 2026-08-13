// Last updated: 8/13/2026, 3:43:32 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> map = new HashMap<>();
        long sum = 0;
        long ans = Long.MIN_VALUE;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(num - k)) {
                ans = Math.max(ans, sum - map.get(num - k));
            }

            if (map.containsKey(num + k)) {
                ans = Math.max(ans, sum - map.get(num + k));
            }

            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), sum - num));
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}