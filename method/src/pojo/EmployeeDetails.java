package pojo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {
	ArrayList<Employee> el = new ArrayList<>();

	public void addEmployee(Employee employee) {
		el.add(employee);
	}

	public void removeEmployee(String name) {
		for (Iterator i = el.iterator(); i.hasNext();) {
			Employee employee = (Employee) i.next();
			if (employee.getEmployeeName().equals(name)) {
				i.remove();
			}
		}
	}

	
	public void searchEmployee(String name, int id) {
		for (Employee employee : el) {
			if (employee.getEmployeeName().equalsIgnoreCase(name) || employee.getEmployeeId()==id) {
				System.out.println(employee.getEmployeeName() + " " + employee.getEmployeeId() + " " + employee.getSalary());
			}
		}
	}
	public Employee highestSalary() {
		int maxValue=0;
		Employee maxSal = null;
		for (Employee employee : el) {
			if(employee.getSalary()>maxValue)
			{
				maxValue=employee.getSalary(); 
				maxSal = employee;
			}
		}
		return maxSal;
	}
	
	public void showEmployee() {
		for (Employee employee : el) {
			System.out.println(employee.getEmployeeId() + " " + employee.getEmployeeName() + " " + employee.getSalary());
		}
	}

	public static void main(String[] args) {
		EmployeeDetails employeelist = new EmployeeDetails();
		Employee e1 = new Employee(1, "Tharani", 2000);
		Employee e2 = new Employee(2, "Aruna", 3000);
		Employee e3 = new Employee(3, "Subramani", 4000);
		Employee e4 = new Employee(4, "Kesavan", 2000);
		Employee e5 = new Employee(5, "sorna", 2000);
		employeelist.addEmployee(e1);
		employeelist.addEmployee(e2);
	 	employeelist.addEmployee(e3);
		employeelist.addEmployee(e4);
		employeelist.addEmployee(e5);
		//employeelist.showEmployee();
		//System.out.println();
		//employeelist.removeEmployee("Tharani");
		//System.out.println();
		//employeelist.searchEmployee("Sorna", 5);
		System.out.println(employeelist.highestSalary().getEmployeeId()+" "+employeelist.highestSalary().getEmployeeName());
		//System.out.println();
	}

	
}
