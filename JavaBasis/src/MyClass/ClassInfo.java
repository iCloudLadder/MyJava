package MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JTextField;

public class ClassInfo {

	public static void main(String[] args) {
		
		JTextField tf = new JTextField();
		
		Class<? extends JTextField> tfClass =  tf.getClass(); // 获取对象所属的 类类型
		System.out.println(tfClass);
		

		Package tfPackage = tfClass.getPackage(); // 获取类的包路径
		System.out.println(tfPackage);
		
		String tfName = tfClass.getName(); // 获取类的名字
		System.out.println(tfName);
		
		Class<?> tfSuperClass = tfClass.getSuperclass(); // 获取类的父类 类型
		System.out.println(tfSuperClass);
		
		Class<?>[] interfaces = tfClass.getInterfaces(); // 实现的接口
		System.out.println(interfaces);
		
		Constructor<?>[] constructor = tfClass.getConstructors(); // public 构造方法
		System.out.println(constructor);
		// tfClass.getConstructor(parameterTypes) // 获取指定 public 构造方法
		
		Constructor<?>[] constructor1 = tfClass.getDeclaredConstructors(); // 所有 构造方法，按声明顺序
		System.out.println(constructor1);
		// tfClass.getDeclaredConstructor(parameterTypes) // 获取指定 构造方法
		
		Method[] methods = tfClass.getMethods(); // 所有的 public 方法
		System.out.println(methods);
		// tfClass.getMethod(name, parameterTypes) // 获取指定 public 方法
		
		Method[] methods1 = tfClass.getDeclaredMethods(); // 所有的 方法
		System.out.println(methods1);
		// tfClass.getDeclaredMethod(name, parameterTypes) //  获取指定 方法
		
		
		Field[] fields = tfClass.getFields(); // 所有 public 成员变量
		System.out.println(fields);
		// tfClass.getField(name) // 指定的 public 成员变量
		
		Field[] allFields = tfClass.getDeclaredFields(); //  所有 成员变量
		System.out.println(allFields);
		// tfClass.getDeclaredField(name) // 指定的 成员变量
		
		
		Class<?>[] innerClasses = tfClass.getClasses(); // 所有 public 的内部类
		System.out.println(innerClasses);
		
		Class<?>[] allInnerClasses = tfClass.getDeclaredClasses(); // 所有 的内部类
		System.out.println(allInnerClasses);
		
		
		Class<?> outClass = tfClass.getDeclaringClass(); // 获取外部类，若本身是内部类则返回其外部类，否则返回 null
		System.out.println(outClass);

		

	}

}
