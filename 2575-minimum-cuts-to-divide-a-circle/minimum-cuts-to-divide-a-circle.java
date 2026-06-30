class Solution {
    public int numberOfCuts(int n) {
        int s;
        if(n==1)
        {
            s=0;
        }
        else if(n%2==0){
           s=n/2; 
        }
        else{
            s=n;
        }
        return s;
    }
}