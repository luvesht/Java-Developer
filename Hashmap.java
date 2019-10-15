/*Hashmap Java*/

import java.util.HashMap; 
import java.util.Map; 

public class GFG { 
	public static void main(String[] args) 
	{ 

		HashMap<String, Integer> map 
			= new HashMap<>(); 

		print(map); 
		map.put("Luvesh", 10); 
		map.put("Manan", 30); 
		map.put("Ruchir", 20); 

		System.out.println("Size of map is:- "
						+ map.size()); 

		print(map); 
		if (map.containsKey("Luvesh")) { 
			Integer a = map.get("Luvesh"); 
			System.out.println("value for key"
							+ " \"Luvesh\" is:- "
							+ a); 
		} 

		map.clear(); 
		print(map); 
	} 

	public static void print(Map<String, Integer> map) 
	{ 
		if (map.isEmpty()) { 
			System.out.println("map is empty"); 
		} 

		else { 
			System.out.println(map); 
		} 
	} 
} 