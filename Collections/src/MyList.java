import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * ArrayList 可变数组，所有元素均可为null
 * 优点：可根据索引对其中的元素快速访问
 * 缺点：向指定索引插入或删除对象时，速度较慢
 * 
 * 
 * LinkedList 采取链表结构存储对象
 * 优点：便于向其中插入或删除元对象
 * 缺点：随机访问其中元素时，速度较慢
 * 
 * */


public class MyList {
	
	static void print(String str) {
		System.out.print(str);
	}
	
	static void println(String str) {
		System.out.print(str + "\n");
	}
	
	
	static void printCollection(List<?> list) {
		Iterator<?> it = list.iterator(); // 获取包含 所有对象的 迭代器
		while (it.hasNext()) {
			print(it.next() + " ");
		}
		print("\n");
	}

	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<String>(); // ArrayList
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		myList.add("A");
		myList.add("A");
		myList.add("C");
	
		print("修改前的集合：");
		printCollection(myList);
		
		print("调用 set 修改后：");
		myList.set(1, "a");  // 修改 index 位置的值
		printCollection(myList);
		
		
		print("调用 add 修改后：");
		myList.add(1, "b"); // 在 index 位置添加一个值
		printCollection(myList);
		
		print("调用 remove 某个对象：");
		myList.remove("C"); // 只删除 第一个 要删除的元素
		printCollection(myList);
		
		print("调用 remove 索引为0的元素：");
		myList.remove(0);
		printCollection(myList);
		
		
		List<String> removeList =  new LinkedList<String>();
		removeList.add("D");
		removeList.add("b");
		print("调用 remove 所包含的另一个集合的元素：");
		myList.removeAll(removeList);
		printCollection(myList);
		
		List<String> addList =  removeList;
		print("调用 add 在 index 位置所包含的另一个集合的元素：");
		myList.addAll(3, addList);
		printCollection(myList);
		
		
		print("获取index为1位置的值 = " + myList.get(1));
		
		println("获取 A 的索引 = " + myList.indexOf("A")); // 或 元素第一次出现的 位置， 找不到则返回 -1
		println("获取 E 的索引 = " + myList.indexOf("E")); // 或 元素第一次出现的 位置， 找不到则返回 -1
		println("获取 A 最后一次出现的索引：" + myList.lastIndexOf("A")); // 或 元素最后一次出现的 位置， 找不到则返回 -1
		 
		print("获取子 列表 = ");
		printCollection(myList.subList(2, 4)); // 从 第二个开始 到 第四个，但不包含第四个元素

	}

}
