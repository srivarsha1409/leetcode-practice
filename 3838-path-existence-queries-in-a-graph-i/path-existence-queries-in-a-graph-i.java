class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] group = new int[n];

        int g = 0;
        group[0] = g;

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] > maxDiff) {
                g++;
            }
            group[i] = g;
        }

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            if (group[u] == group[v]) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }

        return ans;
    }
}