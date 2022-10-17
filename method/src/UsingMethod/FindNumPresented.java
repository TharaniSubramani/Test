package UsingMethod;

public class FindNumPresented {
	public static boolean findNum(int[] array ,int findNumber) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findNumber) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean find = findNum(array ,9);

		if(find)
		{
			System.out.println("exist");
		}
		else
		{
			System.out.println("not exist");
		}
	}
}
