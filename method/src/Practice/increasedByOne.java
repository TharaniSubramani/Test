package Practice;
// input={1,2,3} & output={1,2,4}
public class increasedByOne {
	public static void main(String[] args) {
		int[] array= {1,2,9};
		int length=array.length;
		int sum=0; int ans=0;
		for(int i=0;i<array.length;i++) {
			sum=sum*10+array[i];}
		ans=sum+1;
		int[] arr=new int[length];
		for(int i=arr.length-1;i>=0;i--) {
			arr[i]=ans%10;
			ans=ans/10;
		}
		for(int i=0;i<arr.length;i++) {
System.out.println(arr[i]);
		}}}

	
	
