class Solution {
    public int findNumbers(int[] nums) {
    int sum=0;
    for(int i=0;i<nums.length;i++){
        int a=countDigits(nums[i]);
        if(a%2==0){
            sum+=1;
        }
    }
    return sum;
    }
    public int countDigits(int num){
        int c=0;
        while(num>0){
            num=num/10;
            c+=1;
        }
        return c;
    }
}