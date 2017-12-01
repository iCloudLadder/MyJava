import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/*
 * HashMap 是基于hash表实现的 Map接口，key和value 都可以为 null，但必须保证key的唯一性
 * 其不保证映射的顺序，通过哈希码快速查找，添加和删除操作效率更高
 * 
 * 
 * TreeMap 集合内映射有一定顺序；根据key按一定顺序排列，不允许key对象为null
 * 添加、删除、查找效率相对较慢
 * 
 * 
 * 
 * 
 * */



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
		
		println("遍历HashMap ---------------:");
		Iterator<String> myIterator = myMap.keySet().iterator();
		while (myIterator.hasNext()) {
			String key = myIterator.next();
			String value = myMap.get(key);
			println("key = " + key + ", value = " + value);
		}
		
	}

}
