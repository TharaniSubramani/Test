package UsingMethod;

public class StarPyramid {
	

    public static void starPyramid(int num) {
    	for(int i=0;i<num;i++) {
    		for(int j=0;j<num-i-1;j++) {
        		System.out.print(" ");}
    		for(int k=0;k<i*2+1;k++) {
        		System.out.print("*");}
    		System.out.println();}
    } 
    public static void main(String[] args) {
		starPyramid(10);	
    		
    	}
    }
    