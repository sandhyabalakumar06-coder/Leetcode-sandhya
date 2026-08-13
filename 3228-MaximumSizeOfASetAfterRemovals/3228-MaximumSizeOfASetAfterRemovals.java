// Last updated: 8/13/2026, 3:43:50 PM
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        int n = nums1.length / 2;

        int only1 = 0;
        int only2 = 0;
        int common = 0;

        for (int x : set1) {
            if (set2.contains(x))
                common++;
            else
                only1++;
        }

        for (int x : set2) {
            if (!set1.contains(x))
                only2++;
        }

        int take1 = Math.min(only1, n);
        int take2 = Math.min(only2, n);

        int remaining = 2 * n - take1 - take2;

        int commonTake = Math.min(common, remaining);

        return take1 + take2 + commonTake;
    }
}