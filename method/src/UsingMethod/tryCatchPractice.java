package UsingMethod;

public class tryCatchPractice {
	public static int usingMethod(int a) {
		int ans = 0;
		ans = a / 0;
		return ans;
	}

	public static void main(String[] args) throws Throwable {
		System.out.println(usingMethod(13));

	}
}
