package UsingMethod;

public class Choclate {

	public static int NoOfChoclate(int rupees, int priceOfChoclate, int wrapForChoc) {
		int numberOfChoclate, numberOfWrapper;
		numberOfChoclate = rupees / priceOfChoclate;
		numberOfWrapper = numberOfChoclate;
		if (numberOfWrapper >= wrapForChoc) {
			int extraChoc = numberOfWrapper / wrapForChoc;
			numberOfChoclate = numberOfChoclate + extraChoc;
			int extrawrap = numberOfWrapper % wrapForChoc;
			numberOfWrapper = extraChoc + extrawrap;
		}
		return numberOfChoclate;
	}
	public static void main(String[] args) {
		System.out.println(NoOfChoclate(100,3,3));
	}
}