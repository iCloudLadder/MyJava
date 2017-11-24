import java.util.*;

public class JArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] iArray = new int[5]; // 整形 默认初始化为 0
		long[] lArray = new long[5]; 
		
		System.out.println(Arrays.toString(iArray));
		System.out.println(Arrays.toString(lArray));
		
		double[] dArray = new double[5]; // 浮点型 默认初始化为 0.0 , float double
		System.out.println(Arrays.toString(dArray));
		
		char[] cArray = new char[5]; // char 默认初始化为 空字符'' 
		System.out.println(Arrays.toString(cArray));
		
		
		boolean[] bArray = new boolean[5]; // boolean 默认初始化为 false 
		System.out.println(Arrays.toString(bArray));
		
		Object[] oArray = new Object[5]; // Object 默认初始化为 null 
		System.out.println(Arrays.toString(oArray));

		// 数组的另一种创建
		int iArray1[] = new int[5];
		System.out.println(Arrays.toString(iArray1));
		
		
		
		// 数组的初始化
		int[] iArray2 = new int[]{1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(iArray2));
		
		int[] iArray3 = {2, 3, 4, 5};
		System.out.println(Arrays.toString(iArray3));
		
		// 数组元素的个数
		System.out.println(iArray2.length);
		System.out.println(iArray3.length);
		
		
		// 数组的最大长度
//		int[] iArray4 = new int[2147483648]; // error
//		int[] iArray4 = new int[2147483647]; // can not run
		int[] iArray4 = new int[0]; // 没有元素的数组
//		int[] iArray4 = new int[-1]; // 不能为负数

		
		
		// 数组的索引， 索引的范围 0..< Array.length, 不能越界
		// 使用索引获取和修改数组的值
		int[] iArray5 = {10, 20, 30, 40, 50};
		
		System.out.println(iArray5[1]);
		iArray5[1] = 200;
		System.out.println(iArray5[1]);

	}

}
