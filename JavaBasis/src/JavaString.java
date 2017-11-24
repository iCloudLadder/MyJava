import org.omg.CORBA.SystemException;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 比较
		String s1 = "abc";
		String s2 = "abcd";
		System.out.println(s1.compareTo(s2));
		
		// 长度
		System.out.println(s2.length());
		
		
		// 字符
		System.out.println(s1.charAt(0));
		// System.out.println(s1.charAt(3)); // error
		
		String s3 = "汉字";
		for (int index = 0; index < s3.length(); index++) {
			System.out.println(s3.charAt(index));
		}
		
		// 子字符串
		String s4 = "1234567890";
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(2, 4)); // 34
		
		// 查找字符的位置
		String s5 = "3467345678";
		
		System.out.println(s5.indexOf('3'));
		// 查找第二个 3
		int loc = s5.indexOf('3');
		System.out.println(s5.indexOf('3', loc + 1));
		
		// 查找字符串
		System.out.println(s5.indexOf("3"));

		// 找最后一个
		System.out.println(s5.lastIndexOf("3"));
		System.out.println(s5.lastIndexOf("3", loc + 1));
		
		// 大小写
		String s6 = s2.toUpperCase();
		System.out.println(s6);
		System.out.println(s6.toLowerCase());
		
		// 替换
		String s7 = s2.replace("bc", "yu");
		System.out.println(s7);
		
		String s71 = "abcdabcdef";
		System.out.println(s71.replaceFirst("bc", "io"));
		System.out.println(s71.replace("bc", "io"));
		

		// 是否以某字符串开头结尾
		System.out.println(s7.startsWith("ab"));
		System.out.println(s7.endsWith("ud"));
		
		// 取出首尾的空格
		String s8 = " 230 99 00 ";
		System.out.print(s8);
		System.out.print("|");
		System.out.print(s8.trim());
		System.out.print("|");
		System.out.println(s8.trim());
		
		// switch - case
		String s9 = "ABC";
		switch (s9) {
		case "123":
			System.out.println("数字");
			break;
		case "ABC":
			System.out.println("字母");
			break;
		default:
			break;
		}

	}

}
