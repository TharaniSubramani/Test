package UsingMethod;

public class LcmHcfNumbers {
	public static int lcm(int a, int b) {
		int lcm = 0, gcd = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
			lcm = (a * b) / gcd;
		}
		return lcm;
	}

	public static int hcf(int a, int b) {
		int hcf = 0, gcd = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static boolean primeNumber(int n) {
		for (int i = 2; i < n; i++) {
			if (n%i != 0)
			{
				return true;
		}
		}
		return false;
	}
	

	
	
	public static void main(String[] args) {
		//int lcmAnswer = lcm(12, 20);
		//for(int k=0;k<10;k++) {
		boolean ans= primeNumber(10);
		System.out.println(ans);
	}
}
