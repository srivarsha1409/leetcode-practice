class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            int b = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    b++;
                }
            }

            if(b == arr[i] && arr[i] > ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}