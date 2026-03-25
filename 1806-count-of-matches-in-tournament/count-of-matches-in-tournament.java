class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        int a=0;
        while(n>1){if(n%2==0){
           c=n/2;
           a+=c;
           n/=2;
        }
        else{
            int b=(n-1)/2;
            c=b;
            a+=c;
            n=b+1;
        }
        }
        return a;
    }
}