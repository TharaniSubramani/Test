package UsingMethod;

public class PrintTriangleNumbers {
public static void TriangleNum(int num) {
	for(int i=0;i<num;i++) {
		int count=0;
	
		for(int j=0;j<num-i-1;j++) {
			System.out.print(" ");}
			for(int k=0;k<i*2+1;k++) {
				
				System.out.print((++count));}
			System.out.println();}}
public static void main(String[] args) {
	TriangleNum(5);
}
}
