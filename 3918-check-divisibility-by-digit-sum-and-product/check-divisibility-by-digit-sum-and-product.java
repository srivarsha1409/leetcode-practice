class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int b=0;
        int c=1;
        while(n>0){
             int t=n%10;
             b+=t;
             c*=t;
             n/=10;
        }
        int d=b+c;
        if(a%d==0){
            return true;
        }
        else{
            return false;
        }
    }
}