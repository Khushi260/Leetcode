class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                 board[i][j]='.';
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        solve(board,0,ans,new ArrayList<>());
        return ans;

    }

    public void solve(char[][] board, int col,List<List<String>> ans,List<String> al){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }

        for(int row =0; row<board.length; row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                solve(board,col+1,ans,al);
                board[row][col]='.';
            }
        }
    }

    public boolean isSafe(char[][] board,int row, int col){
        int duprow = row;
        int dupcol = col;

        //left upper diagonal
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        //left logic
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }

        
        row = duprow;
        col = dupcol;
        //left down diagonal logic
        while(row<board.length && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

    public List <String> construct(char[][] board) {
        List <String> res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
