package UsingMethod;

public class primeNumbers {
	public static boolean IsPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = IsPrimeNumber(9);
		if (isPrime) {
			System.out.println("not prime number");
		} else {
			System.out.println("prime number");
		}
	}
}