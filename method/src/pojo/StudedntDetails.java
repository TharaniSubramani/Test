package pojo;

public class StudedntDetails {
	private static String classname="10th";
	private int id;
	private String name;
	public StudedntDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudedntDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static String getClassname() {
		return classname;
	}
	public static void setClassname(String classname) {
		StudedntDetails.classname = classname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}