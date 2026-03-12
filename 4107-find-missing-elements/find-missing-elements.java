class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        List<Integer> notfound= new ArrayList<>();
        for(int i=min;i<max;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    c=1;
                    break;
                }
            }
            if(c==0){
                notfound.add(i);
            }
        }
           return notfound;
    }
}