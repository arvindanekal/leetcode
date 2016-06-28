public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //validate the rows
        for(int i=0;i<9;i++){
            boolean[] flag = new boolean[9];
            Arrays.fill(flag, false);
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(flag[board[i][j]-'1'] == true)
                    return false;
                flag[board[i][j]-'1'] = true;
            }
        }
        //validate the columns
        for(int i=0;i<9;i++){
            boolean[] flag = new boolean[9];
            Arrays.fill(flag, false);
            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;
                if(flag[board[j][i]-'1'] == true)
                    return false;
                flag[board[j][i]-'1'] = true;
            }
        }
        //validate the sub-rectangles
        for(int m=0;m<3;m++){
            for(int n=0;n<3;n++){
                boolean[] flag = new boolean[9];
                Arrays.fill(flag, false);
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){
                        if(board[m*3+j][n*3+k] == '.') continue;
                        if(flag[board[m*3+j][n*3+k]-'1'] == true)
                            return false;
                        flag[board[m*3+j][n*3+k]-'1'] = true;
                    }
                }
            }
        }
        return true;
    }
}
