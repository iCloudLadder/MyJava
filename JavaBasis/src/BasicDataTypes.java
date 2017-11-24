import java.awt.Window.Type;
import java.awt.print.Printable;

//import java.awt.Window.Type;

public class BasicDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 注意各种类型的取值范围
		// Byte
		System.out.println(Byte.TYPE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		// char
		System.out.println(Character.TYPE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		// short
		System.out.println(Short.TYPE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		// int
		System.out.println(Short.TYPE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// long
		System.out.println(Long.TYPE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		// float
		System.out.println(Float.TYPE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		// double
		System.out.println(Double.TYPE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//?? Java 的基本类型 能不能用 泛型 表示 ?
		
		int i1 = 1233; // 字面量数字默认是 int 类型
		long l1 = 1233L; // 需要使用 L 或 l 来表明变量是 long 类型
		long l2 = 1233L;
		
		double d1 = 3.14; // 浮点型默认是 double，可以在后面加 D 或 d，也可以不加
		float f1 = 3.14f; // float 需要在数字后加 f 或 F
		
		
		// 默认没有前缀的是 十进制
		System.out.println(10); 
		System.out.println(-10);
		System.out.println(010); // 八进制 以 0 开头
		System.out.println(-010); // 八进制 以 0 开头
		System.out.println(0x10); // 十六进制 以 0x 开头
		System.out.println(-0x10);
		System.out.println(0b10); // 二进制 以 0b 开头 
		System.out.println(-0b10);
		
		
		long l3 = 123_456_789; // _ 作为分隔符，增强可读性，不能再开头和结尾，也可以使用多个 _:如 123___345
		System.out.println(l3);
		
		
		// 科学计数法: e或E 表示 10，用于 十进制
		double d4 = 1.2e3; // l4 = 1200
		System.out.println(d4);
		double d5 = 1.2E-3;
		System.out.println(d5);
		
		//   p或P 表示 2，只能用于 十六进制
		double d6 = 0x1.2p2;
		System.out.println(d6);
		double d7 = 0x1.2P-2;
		System.out.println(d7);
		
		
		// 类型转换
		// 小范围转大范围不需要表明转换类型； 反过来必须表明类型，强制转换会有精度损失
		short s10 = 10;
		int i10 = s10;
		long l10 = s10;
		
		long l11 = 11;
		int i11 = (int)l11;
		short s11 =  (short)l11;
		
		// 运算中去最大范围的类型作为结果的类型
		long l12 = l11 + i11 + s11;
		
	}
	
//	private static void printNumber(Type basicType) {
//		System.out.println("Type: " + basicType.);
//	}
		
}
