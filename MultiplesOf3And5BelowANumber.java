//https://projecteuler.net/problem=1
/**
 * 
 * Multiples of 3 and 5
 * Problem 1 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Answer = 233168
 */
public class MultiplesOf3And5BelowANumber {
	public static void main(String[] args) {
		MultiplesOf3And5BelowANumber mul = new MultiplesOf3And5BelowANumber();
		System.out.println("Sum of multiples below 10: " + mul.getMultiplesOf3And5BelowNum(10));		
		System.out.println("Sum of multiples below 1000: " + mul.getMultiplesOf3And5BelowNum(1000));		

		System.out.println("Efficient sum of multiples below 10: " + mul.getEfficientMultiplesOf3And5BelowNum(10));		
		System.out.println("Efficient sum of multiples below 1000: " + mul.getEfficientMultiplesOf3And5BelowNum(1000));		
	}
	
	public int getMultiplesOf3And5BelowNum(int number) {
		int num = number - 1;
		
		int countFor3 = num / 3;
		int countFor5 = num / 5;
		
		int sum = 0;
		for (int i = 1; i <= countFor3; i++) {
			sum += 3 * i;
		}
		
		for (int i = 1; i <= countFor5; i++) {
			if (i % 3 != 0) {
				sum += 5 * i;
			}
		}
		
		return sum;		
	}

	public int getEfficientMultiplesOf3And5BelowNum(int number) {
		int num = number - 1;
		
		int n = num / 3;
		int m = num / 5;
		int lcd = num / 15;
		
		int sum = 0;
		
		sum += 3 * n * (n + 1) / 2;
		sum += 5 * m * (m + 1) / 2;
		sum -= 15 * lcd * (lcd + 1) / 2;
		
		return sum;		
	}
}
