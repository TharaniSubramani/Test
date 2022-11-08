package pojo;

import java.util.ArrayList;

public class Studentlist {
	public static void main(String[] args) {
		ArrayList<StudedntDetails>student=new ArrayList<>();
		StudedntDetails s1= new StudedntDetails(1, "Tharani");
		StudedntDetails s2= new StudedntDetails(2, "Aruna");
		StudedntDetails s3= new StudedntDetails(3, "Ambika");
		StudedntDetails s4= new StudedntDetails(4, "Tharani");
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		
		for (StudedntDetails studedntDetails : student) {
			if (studedntDetails.getName().equals("Tharani")) {				
			}else {
				System.out.println(studedntDetails.getId()+ " "+studedntDetails.getName());
			}
			
		}

	}

}