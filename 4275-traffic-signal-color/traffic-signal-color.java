class Solution {
    public String trafficSignal(int timer) {
        
        String s;
        if(timer==0){
            s="Green";
        }
        else if (timer==30){
            s="Orange";
        }
        else if(30< timer && timer <= 90){
            s="Red";
        }
        else{
           s="Invalid";
        }
       return s;
    }
     
   
}