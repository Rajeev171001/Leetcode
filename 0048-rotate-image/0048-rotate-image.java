class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        reverse(matrix);
        //first take transpose then swap the column
    }
    private static void reverse(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[0].length-1;
            while(start<end){
                int t=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=t;
                start++;
                end--;
                
            }
        }
    }
    
}