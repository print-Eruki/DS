package lab2;
public class Lab03P3Wrapper {
	public static boolean isValidSudoku(char[][] board) {
        for(int i =0; i<9;i++) {
        	for(int j=0; j<9;j++){
        		for(int k =j+1; k<9;k++){
        			if(board[i][j] == board[i][k] && board[i][j] != '.')
        			{
        				return false;
        			}
        		}
        		for(int k =i+1; k<9;k++) {
        			if(board[i][j] == board[k][j] && board[i][j] != '.') {
        				return false;
        			}
        		}
        	}
        }
        return true;
    }
}
