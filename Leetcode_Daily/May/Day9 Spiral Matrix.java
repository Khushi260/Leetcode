class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int rs=0;
        int re=matrix.length-1;
        int cs=0;
        int ce=matrix[0].length-1;
        int limit = matrix.length*matrix[0].length;
        

        while(ans.size()<limit){

            for(int i=rs,j=cs; j<=ce&&ans.size()<limit; j++){
                ans.add(matrix[i][j]);
            }
           
            rs++;

            for(int i=rs,j=ce; i<=re&&ans.size()<limit; i++){
                ans.add(matrix[i][j]);
            }
            
            ce--;

            for(int i=re, j=ce; j>=cs&&ans.size()<limit; j--){
                ans.add(matrix[i][j]);
            }
           
            re--;

            for(int i=re, j=cs; i>=rs&&ans.size()<limit; i--){
                ans.add(matrix[i][j]);
            }
            
            cs++;

        }
        return ans;
    }
}
