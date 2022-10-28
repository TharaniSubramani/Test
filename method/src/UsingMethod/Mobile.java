package UsingMethod;

public class Mobile {
		String name;
		String colour;
		int screensize;
		float size;
		int price;
		String Processor;
		public Mobile(){
		}

		public Mobile(String name1, String colour1) {
			this.size = 0;
			this.name = name1;
			this.colour = colour1;
		}

		public void makecall(String name) {
			System.out.println("calling...");
		}

		public static void main(String[] args) {
			Mobile m1 = new Mobile();
			System.out.println(m1.name);
			Mobile m2 = new Mobile("vivo", "gray");
			System.out.println(m2.name);
			m2.makecall("appa");
			
		}
	}
