package MyClass;


public class OuterClass {
	
	innerClass in = new innerClass();
	int y = 0;
	static int z = 0;
	
	// 内部类
	class innerClass {
		
		int y = 0;
		
		public innerClass() {
		}
		
		public innerClass(int y) {
			y++; // 形参
			this.y++; // 内部类 成员变量 y
			OuterClass.this.y++; // 使用 外部类名.this.* 形式访问外部类成员变量
		}
		public void inf() {
			OuterClass.this.doit(); // 使用 外部类名.this.* 形式访问外部类成员方法
		}
		
	}
	
	
	public innerClass doit() {
		// y = 10; // 外部类不能直接访问内部类的 成员变量或成员方法
		in.y = 10; // 通过内部类实例访问 内部类的成员变量
		
		return new innerClass();
	}
	
	
	public void getLocalInnerClass() {

		// 局部内部类 只能在方法体内使用
		class LocalInnerClass {
			int x = 0;
		}
		
		LocalInnerClass lIner = new LocalInnerClass();
		lIner.x++;
		
		// 使用匿名类 
		jNoName.myPrint();
	}
	
	
	// 匿名类 事件监控中被大量使用
	JNoName jNoName = new JNoName() {

		@Override
		public void myPrint() {
			System.out.println("这是一个匿名类");
		}
		
	};
	
	// 静态内部类
	static class StaticInnerClass {
		//  静态内部类 内不能访问外部类对象
		
		public void tt() {
			
		}
		
	}
	
	// 内部类的继承:    extends 外部类名.内部类名
	class SubInnerClass extends OuterClass.innerClass {
		
	}
	

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		innerClass in = outer.new innerClass(); // 如果在外部类和非静态方法 之外 实例化内部类，需要使用 外部类实例.内部类 的形式创建内部类

		StaticInnerClass sInner = new StaticInnerClass(); // 创建静态内部类不需要 使用 外部类对象
			
		System.out.println("---");
	}

}




