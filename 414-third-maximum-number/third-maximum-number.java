class Solution {
    public int thirdMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;

        boolean secFound = false;
        boolean thirdFound = false;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max && (!secFound || nums[i] > secmax)){
                secmax = nums[i];
                secFound = true;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max && nums[i] != secmax && (!thirdFound || nums[i] > thirdmax)){
                thirdmax = nums[i];
                thirdFound = true;
            }
        }

        if(!thirdFound){
            return max;
        }

        return thirdmax;
    }
}