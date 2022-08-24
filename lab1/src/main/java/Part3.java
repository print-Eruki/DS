import java.util.ArrayList;

public class Lab01P4Wrapper {

public static interface AdvancedArithmetic {
		
		/**
		 * Method that takes an integer as input and return the sum of all its divisors 
		 * For example divisors of 6 are 1, 2, 3 and 6, so divisorSum() should return 12
		 *
		 * @param n - number to take the divisors of
		 * @return An integer denoting the sum of each divisor of n
		 */
		int divisorSum(int n);
		
		/**
		 * Method that takes an integer as input and return an array of all its prime factors 
		 * For example prime factors of 12 are 2, 2 and 3, so primeFactors() should return [2, 2, 3]
		 *
		 * HINT: Use an ArrayList to store the numbers, then pass them on to an int array, 
		 * similar to a vector in C++.
		 *
		 * HINT: Remember the difference between Object Data Types and Primitive Data Types
		 * so you can succesfully store values and pass them
		 *
		 * @param n - number to take the divisors of
		 * @return An array of type int denoting each prime factor
		 */
		int[] primeFactors(int n);
		
		/**
		 * Method that determines whether a given integer n is a prime number
		 * 
		 * @param n
		 * @return if the number is a prime number or not
		 */
		boolean isPrime(int n);
		
		
		/**
		 * Method that return the nth number in the fibonacci sequence
		 * 
		 * For example if n = 5, then fibonacci(n) returns 5 because the fifth term in the sequence is 5
		 * 
		 * Remember that the sequence starts with 1 and 1, then the next term in the series is the sum
		 * of the previous 2 terms:
		 * 
		 * 1,1,2,3,5,8,13,21,...
		 * 
		 * By definition, the fibonacci sequence is defined as follows:
		 * 
		 * F_0 = 0
		 * F_1 = 1
		 * F_n = F_(n-2) + F_(n-1)
		 * 
		 * Bonus Challenge: Doing this recursively is trivial, but can you do this ITERATIVELY?
		 * 
		 * @param n - index of the fibonacci sequence we want to find
		 * @return the value of nth term of the fibonacci sequence
		 */
		int fibonacci(int n);
		
	}
	
	public static class AdvancedCalculator implements AdvancedArithmetic {
		
		public int[] testValues; //DO NOT DELETE THIS, TEST WILL FAIL
		
		public AdvancedCalculator(int[] testValues) {
			this.testValues = testValues;
		}
		
		@Override
		public int divisorSum(int n){
			int i = 1;
			int sum = 0;
			while(i != n + 1) {
				if(n % i == 0) sum += i;
				i++;
			}
			return sum;
		}
		
		@Override
		public int[] primeFactors(int n) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int num = 2;
			while(n != 1)
			{
				if(isPrime(n)){
					arr.add(n);
					break;
				}
				else if(n%num == 0)
				{
					n /= num;
					arr.add(num);
					
				}
				else num++;
			}//end of while loop
			int[] result = new int[arr.size()];
			for(int i =0; i<arr.size();i++)
			{
				result[i] = arr.get(i);
			}
			return result;
			
		}
		
		@Override
		public boolean isPrime(int n){
			if(divisorSum(n) == n+1) return true;
			return false;
		}
		
		@Override
		public int fibonacci(int n){
			//1,1,2,3,5,8,13,21,...
			int prev = 0;
			int curr = 1;
			for(int i =1; i<n;i++) {
				int temp = curr;
				curr += prev;
				prev = temp;
			}
			return curr;
		}
	}
}