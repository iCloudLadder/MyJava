import java.util.HashMap;
import java.util.Map;

public class MyMap {
	
	static void print(String str) {
		System.out.print(str);
	}
	
	static void println(String str) {
		System.out.print(str + "\n");
	}

	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<>();
		
		myMap.put("1", "apple");
		myMap.put("2", "pear");
		myMap.put("3", "orange");

		boolean con1 = myMap.containsKey("2");
		println("myMap中是否包含 key是 2: " + con1);
		boolean con2 = myMap.containsValue("peach");
		println("myMap中是否包含 value是 peach: " + con2);
		
		String str1 = myMap.get("3");
		println("myMap中 key = 3, 所对应的value: " + str1);
		
		println("myMap中所有的key: " + myMap.keySet());
		println("myMap中所有的value: " + myMap.values());
		
	}

}
