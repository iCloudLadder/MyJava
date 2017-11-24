package MyClass;

/*
 * public 同一包都内任何地方可访问，其他包想访问要先导入此包
 * package 导入一个包才能访问包内 public
 * protected 同一个包内的子类或本类
 * private 仅能本类访问
 * */

public class Dog extends Animal {
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	// 重写
	@Override
	public void cry() {
		System.out.println("汪汪汪！");
	}
	
	// 重载，方法名相同，参数不同。返回值类型不能用来区分方法的重载
	public void cry(int n) {
		System.out.println("汪汪汪！" + n + " 次");
	}
	
	public void callSuper() {
		super.cry(); // super 用来访问父类中的方法或成员变量
		this.cry();  // this 用来访问本类中的方法或成员变量，用来指当前实例对象
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.cry();
		
		Dog dog = new Dog();
		dog.cry();
		dog.cry(4);
		
		
		Cat cat = new Cat();
		cat.cry();
		
		
	}

}
