class Solution {
    public void setZeroes(int[][] matrix) {

       int rows=matrix.length;
       int cols=matrix[0].length;
    
    boolean[] rowsZeros=new boolean[rows];
    boolean[] colsZeros=new boolean[cols];

        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==0){
                    rowsZeros[i]=true;
                    colsZeros[j]=true;
               }
           }
        }


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(rowsZeros[i] || colsZeros[j]){
                     matrix[i][j]=0;
                }
            }
        }

    }
}