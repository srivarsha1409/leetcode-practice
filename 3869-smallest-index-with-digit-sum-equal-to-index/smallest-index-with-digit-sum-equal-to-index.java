class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
               int c=0;
               int d=nums[i];
               if(d==0){
                c=0;
               }
               while(d>0){
                int t=d%10;
                c+=t;
                d/=10;
               }

                if(c==i){
                    return i;
                }
                
        }
        return -1;
    }
}