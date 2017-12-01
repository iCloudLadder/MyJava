import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class MyIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> myArrList = new ArrayList<Integer>(); 
		// 添加元素
		Collections.addAll(myArrList, 11, 12, 13, 14, 15);
		MyPrint.println("集合中元素：" + myArrList);
		
		ListIterator<Integer> listIte = myArrList.listIterator();
		MyPrint.println("集合是否有下一个元素：" + listIte.hasNext());
		MyPrint.println("集合是否有前一个元素：" + listIte.hasPrevious());
		MyPrint.println("集合的下一个元素：" + listIte.next());
		MyPrint.println("集合下一个元素的索引：" + listIte.nextIndex());
		MyPrint.println("集合的前一个元素：" + listIte.previous());
		MyPrint.println("集合前一个元素的索引：" + listIte.previousIndex());
		MyPrint.println("集合下一个元素的索引：" + listIte.nextIndex());
		listIte.add(16);
		MyPrint.println("添加 16 后集合中元素：" + myArrList);
		MyPrint.println("集合前一个元素的索引：" + listIte.previousIndex());
		MyPrint.println("集合下一个元素的索引：" + listIte.nextIndex());
		MyPrint.println("集合的下一个元素：" + listIte.next());
		listIte.set(17);
		MyPrint.println("设置 17 后集合中元素：" + myArrList);
		listIte.remove();
		MyPrint.println("删除 next() 后的集合：" + myArrList);
	}

}
