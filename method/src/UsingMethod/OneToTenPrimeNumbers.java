package UsingMethod;

public class OneToTenPrimeNumbers {
	public static void main(String[] args) {
		System.out.println(2);
		for (int j = 3; j <= 100; j++) {
			boolean isprime = true;
			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime)
				System.out.println(j);
		}
	}
}