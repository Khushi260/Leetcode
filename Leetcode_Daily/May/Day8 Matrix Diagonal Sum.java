class Solution {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int sum = 0;

        for(int i=0; i<rows; i++){
            sum+= mat[i][i]; //primary diagonal
            sum += mat[rows-1-i][i]; //secondary diagonal
        }

        if(rows%2==0){
            return sum;
        }else{
            return sum-mat[rows/2][rows/2];
        }

    }
}
