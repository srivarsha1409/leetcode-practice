class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     String s="";
     for(int i=0;i<word1.length;i++){
        s+=word1[i];
     }   

     String s1="";
     for(int j=0;j<word2.length;j++){
        s1+=word2[j];
     }
     if(s.length()!=s1.length()){
        return false;
     }
     for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        
     
     return true;
    }
}