package Practice;

import java.util.Arrays;

public class zigzagString {
	public static void main(String[] args) {
		String name="PAYPALISHIRING"; int r=3;
		if(r==1) {
			System.out.println(name);}
		else {
			char[] str=name.toCharArray();
			String[] array=new String[r];
			Arrays.fill(array, "");
			int row=0; boolean up=true;
			for(int i=0;i<str.length;i++) {
				array[row]=array[row]+str[i];
				if(row==r-1) {
					up=false;
				}if(row==0) {
					up=true;
				}if(up) {
					row++;
				}else {
					row--;
				}
			} String name1="";
			for(int i=0;i<array.length;i++) {
				 name1=name1.concat(array[i]);
		}
			System.out.println(name1);
		}
	}}