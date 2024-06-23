package packagecollection;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
 		Map<String, String> hash_table = (Map<String, String>) new HashMap();//creating a hash table
		         hash_table.put("1", "Monday");
		         hash_table.put("2", "Tuesday");
		         hash_table.put("3", "Wednesday");
		         hash_table.put("4", "Thursday");
		         hash_table.put("5", "Friday");
		         hash_table.put("6", "Saturday");
		         hash_table.put("7", "Sunday");
		         hash_table.put("8", "Sunday");
		        // hash_table.remove("6");
		         //System.out.println("After del 6 :"+hash_table);
		         hash_table.putIfAbsent("9", "day");
		         hash_table.putIfAbsent("6", "Friday");
		         //hash_table.put("10", null);
		         System.out.println(hash_table);
		         
		         Map<Integer, String> hash_map = (Map<Integer, String>) new HashMap();
		         hash_map.put(1, "pooja");
		         hash_map.put(2, "priya");
		         hash_map.put(3, "prualu");
		         System.out.println(hash_map);
//		        Map<String,String> hclone=(Map<String, String>) ((HashMap<String, String>) hash_table).clone();
//		        System.out.println("***"+hclone); 
}
}