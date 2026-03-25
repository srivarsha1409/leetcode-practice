class Solution {
    public int numberOfSteps(int num) {
      int c=0;
      while(num>0){
        for(int i=0;i<=num;i++){
        if(num%2==0){
            num=num/2;
            c+=1;
        }
        else{
            num=num-1;
            c+=1;
        }
        }

      }
      return c;  
    }
}