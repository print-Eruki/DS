package lab2;
import java.util.Arrays;

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
	
	public static int[] twoSum(int[] array, int targetSum) {
		//sort the array
		Arrays.sort(array);
		int[] nums = new int[2];
		boolean isSolved = false;
		int start = 0;
		int end = array.length - 1;
		while(start != end)
		{
			if(array[start] + array[end] == targetSum)
			{
				nums[0] = array[start];
				nums[1] = array[end];
				isSolved = true;
			}
			else if(array[start] + array[end] > targetSum) end--;
			else if(array[start] + array[end] < targetSum) start++;
		}
		if(!isSolved) return new int[0];
		return nums;
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int[] left = new int[nums.length];
		left[0] = 1;
		for(int i = 1; i< nums.length;i++)
		{
			left[i] = left[i-1] * nums[i-1];
		}
		int[] right = new int[nums.length];
		right[nums.length - 1] = 1;
		for(int i = nums.length-2; i>=0;i--)
		{
			right[i] = nums[i+1] * right[i+1];
		}
		int[] answer = new int[nums.length];
		for(int i =0; i<nums.length;i++)
		{
			answer[i] = left[i] * right[i];
		}
		return answer;		
    }
}
