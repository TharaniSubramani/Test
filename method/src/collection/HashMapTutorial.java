package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
	public static void main(String[] args) {
		Map<Integer, String> name= new HashMap<>();
		name.put(1, "Tharani");
		name.put(2, "Pawani Sri");
		name.put(1, "Tamil");
		
		for(Map.Entry<Integer, String> e: name.entrySet()) {
			System.out.println(e.getKey()+ ":" + e.getValue());
		}
			
	}

}
