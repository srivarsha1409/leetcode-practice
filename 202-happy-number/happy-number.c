bool isHappy(int n) {
    int a=0;
    if(n ==1){
        return true;
    }
    if(n >=2 && n<= 4){
        return false;
    }
    while(n>0){
        int t=n%10;
        a+=t*t;
        n/=10;
    }
    return isHappy(a);
}