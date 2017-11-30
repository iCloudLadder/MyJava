import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Myset {

	static void print(String str) {
		System.out.print(str);
	}
	
	static void println(String str) {
		System.out.print(str + "\n");
	}
	
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		
		mySet.add("one");
		mySet.add("two");
		mySet.add("one"); // 重复的对象只会被添加
		println("添加元素后的集合：" + mySet + " 集合的size = " + mySet.size());
		
		List<String> list = new ArrayList<String>();
		list.add("three");
		list.add("four");
		mySet.addAll(list);
		println("添加另一个集合后的集合：" + mySet + " 集合的size = " + mySet.size());
		
		println("-----------------");
		Iterator<String> iterator = mySet.iterator();
		for (;iterator.hasNext();) {
			println(iterator.next());
		}
		println("-----------------");
		
		
		mySet.remove("one");
		println("删除one后的集合：" + mySet + " 集合的size = " + mySet.size());
		
		mySet.removeAll(list);
		println("删除另一个集合后的集合：" + mySet + " 集合的size = " + mySet.size());
		
		
		println("集合是否为空：" + mySet.isEmpty());
		mySet.clear();
		println("清空集合后，集合是否为空：" + mySet.isEmpty());
		
		
		mySet.add("one");
		mySet.add("two");
		List<String> list1 = new ArrayList<String>();
		list1.add("two");
		list1.add("three");
		println("集合中所有元素：" + mySet);
		mySet.retainAll(list1); // 从mySet中删除不在 list1中的元素，类似求交集
		println("retain 后 集合中所有元素：" + mySet);
		
		
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("C");
		hashSet.add("D");
		println("hashSet = " + hashSet);
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("D");
		println("treeSet = " + treeSet);
		
	}

}
