class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> l1 = new ArrayList<Integer>();
        int cmin=0,rmax=matrix.length-1,cmax=matrix[0].length-1,rmin=0;
        while(cmin<=cmax || rmin<=rmax){
                if(rmin<=rmax){
                    for(int i=cmin;i<=cmax;i++)
                    l1.add(matrix[rmin][i]);
                    rmin++;
                }
                if(cmin<=cmax){
                    for(int i=rmin;i<=rmax;i++)
                    l1.add(matrix[i][cmax]);
                    cmax--;
                }
                if(rmin<=rmax){
                    for(int i=cmax;i>=cmin;i--)
                    l1.add(matrix[rmax][i]);
                    rmax--;
                }
                if(cmin<=cmax){
                    for(int i=rmax;i>=rmin;i--)
                    l1.add(matrix[i][cmin]);
                    cmin++;
                }
        }
        return l1;
    }
}