import java.util.Iterator;
import java.util.Random;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); // 随机数
		// 常量
		final int i0 = random.nextInt();
		System.out.println("常量 i = " + i0);
		// i0 = 12; error
		
		int i1 = random.nextInt();
		System.out.println("i1 = " + i1);
		// if 
		if (i1 > 10) {
			System.out.println("i1 > 10");
		}
		
		// if - else
		if (i1 > 10) {
			System.out.println("i1 > 10");
		} else {
			System.out.println("i1 <= 10");
		}
		
		
		// if - else if
		System.out.print("i1 是：");
		if (i1 < 0) {
			System.out.println("负整数");
		} else if (i1 > 0) {
			System.out.println("正整数");
		} else {
			System.out.println("零");
		}
		
		
		// for
		for (int j = 0; j < 10; j++) {
			System.out.println("随机整数 j" + j + "= " + (int)(Math.random()*10));
		}
		
		
		// while
		int randomCount = (int)(Math.random()*10);
		while (randomCount >0) {
			System.out.println("randomCount = " + randomCount--);
		}
		
		
		// do - while 至少执行一次循环体
		int i2 = (int)(Math.random()*10) + 1;
		do {
			System.out.println("i2 = " + i2--);
		} while (i2 > 0);
		
		System.out.println("--------Continue----------");

		int i3 =  10, i4 = 10;
		System.out.println("i3 = " + i3);
		while (i3 > 0) {
			if (i3 % 3 != 0) {
				i3--;
				continue; // 跳出本次循环，进入下一次循环
			}
			System.out.println(i3--);
		}
		System.out.println("--------Break----------");
		System.out.println("i4 = " + i4);
		while (i4 > 0) {
			if (i4 % 3 != 0) {
				i4--;
				continue; // 跳出本次循环，进入下一次循环
			}
			System.out.println(i4--);
			break; // 跳出整个循环体
		}
		
		
		// 嵌套循环
		System.out.println("------------------");
		final int i5 = 33;
		OUT:  // 循环体的标志
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				
				for (int k = 0; k < 10; k++) {
					if (i + j * 2 + k * 5 == i5) {
						System.out.println("i = " + i + ", j = " + j + ", k = " + k);
						break OUT; // 跳出标志所标的 循环
					}
				}
				
			}
		}
		
		FOR1: for (int j = 0; j < 3; j++) {
			
			for (int k = 0; k < 3; k++) {
				if (k == j) {
					System.out.println("j = k = " + j);
					continue FOR1;
				}
				System.out.println("j = " + j + ", k = " + k);
			}
			
		}
		


	}

}
