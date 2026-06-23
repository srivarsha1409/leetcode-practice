class Solution {

    public int zigZagArrays(int n, int l, int r) {

        final int MOD = 1_000_000_007;
        int m = r - l + 1;
        long[] up = new long[m];
        long[] down = new long[m];
        for (int i = 0; i < m; i++) {

            up[i] = 1;

            down[i] = 1;

        }

        for (int len = 2; len <= n; len++) {

            long[] prefixDown = new long[m + 1];

            long[] prefixUp = new long[m + 1];

            for (int i = 0; i < m; i++) {

                prefixDown[i + 1] = (prefixDown[i] + down[i]) % MOD;

                prefixUp[i + 1] = (prefixUp[i] + up[i]) % MOD;

            }

            long[] newUp = new long[m];

            long[] newDown = new long[m];

            for (int i = 0; i < m; i++) {

                newUp[i] = prefixDown[i];

                newDown[i] = (prefixUp[m] - prefixUp[i + 1] + MOD) % MOD;

            }


            up = newUp;

            down = newDown;

        }



        long ans = 0;

        for (int i = 0; i < m; i++) {

            ans = (ans + up[i] + down[i]) % MOD;

        }



        return (int) ans;

    }

}