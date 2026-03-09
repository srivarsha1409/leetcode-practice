class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int b=0;
        while(x>0){
            int t=x%10;
            b+=t;
            x/=10;
        }
        if(a%b==0){
            return b;
        }
        else{
            return -1;
        }
    }
}