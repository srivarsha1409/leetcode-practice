class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> output=new ArrayList<>();
        for(int i=0;i<order.length;i++){
               for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    output.add(friends[j]);
                }
               }
        }

       int[] c = new int[output.size()];
       for(int i=0;i<output.size();i++){
         c[i]=output.get(i);
       }
       return c;
    }
}