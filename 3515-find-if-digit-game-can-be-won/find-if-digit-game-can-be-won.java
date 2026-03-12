class Solution {
    public boolean canAliceWin(int[] nums) {
        int d=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]>9){
                d+=nums[i];
            }
            else{
                s+=nums[i];
            }
        }

        int a=0;
        int b=0;
        if(d>s || s>d){
            return true;
        }
        else{
            return false;
        }
    }
}