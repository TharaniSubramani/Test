package UsingMethod;

public class MethodWithoutStatic {
	int a;
	int b;
	int c;
	int multi;
	int sub;
	int sum;
	int div;

	public MethodWithoutStatic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MethodWithoutStatic(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		sum = a + b + c;
		multi = a * b * c;
	}

	public MethodWithoutStatic(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		div = a / b;
		sub = a - b;
	}

	public static void main(String[] args) {
		MethodWithoutStatic s1 = new MethodWithoutStatic(10, 11, 12);
		System.out.println(s1.multi);
		MethodWithoutStatic s2 = new MethodWithoutStatic(22, 2);
		System.out.println(s2.multi);
	}

}
