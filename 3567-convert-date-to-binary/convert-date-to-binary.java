class Solution {
    public String convertDateToBinary(String date) {
        
        String[] parts = date.split("-");
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        String y = "";
        int n = year;
        while(n > 0){
            y = (n % 2) + y;
            n = n / 2;
        }
        
        String m = "";
        n = month;
        while(n > 0){
            m = (n % 2) + m;
            n = n / 2;
        }
        
        String d = "";
        n = day;
        while(n > 0){
            d = (n % 2) + d;
            n = n / 2;
        }
        
        return y + "-" + m + "-" + d;
    }
}