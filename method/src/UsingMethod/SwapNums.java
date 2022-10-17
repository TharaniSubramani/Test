package UsingMethod;

public class SwapNums {
 public static void subtrationOfTwoNums(int num1, int num2) {
	 int temp=0;
	 if(num1<num2) {
		 temp=num1;
		 num1=num2;
		 num2=temp;}
	

	 int sub=0;
	 sub=num1-num2;
	 System.out.println(sub);

 }	


 public static void main(String[] args) {
	 
	 subtrationOfTwoNums(5,1);
 }
}
