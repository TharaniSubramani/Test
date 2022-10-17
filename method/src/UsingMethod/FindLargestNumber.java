package UsingMethod;

public class FindLargestNumber {
	
	public static void main(String[] args) {
		int max=0;
		int array[]= {2,3,4,5,7,1};
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
}

}
