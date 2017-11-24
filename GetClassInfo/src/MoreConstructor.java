import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MoreConstructor {
	
	String name;
	int i, i2, i3;
	
	private MoreConstructor() {
		
	}
	
	protected MoreConstructor(String name, int i) {
		this.name = name;
		this.i = i;
	}
	
	public MoreConstructor(String... strings) throws NumberFormatException {
		if (strings.length > 0) {
			i = Integer.valueOf(strings[0]);
		}
		
		if (strings.length > 1) {
			i2 = Integer.valueOf(strings[1]);
		}
		
		if (strings.length > 2) {
			i3 = Integer.valueOf(strings[2]);
		}
	}
	
	public void print() {
		System.out.println("name = " + name);
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}
	
	

	public static void main(String[] args) {
		
		Class<MoreConstructor> mClass = MoreConstructor.class;
		System.out.println(mClass);
		
		
		Constructor<?>[] ctArr = mClass.getDeclaredConstructors();
		
		for (Constructor<?> ct : ctArr) {
			
			System.out.println("是否是可变参数：" + ct.isVarArgs());
			
			System.out.println("构造函数的参数依次是：");
			Class<?>[] parasType = ct.getParameterTypes();
			for (Class<?> class1 : parasType) {
				System.out.println(class1);
			}
			
			System.out.println("构造函数抛出的异常依次是：");
			Class<?>[] exces = ct.getExceptionTypes();
			for (Class<?> exception : exces) {
				System.out.println(exception);
			}
			
			int mods = ct.getModifiers();
			if (Modifier.isPrivate(mods)) {
				System.out.println("私有方法");
				ct.setAccessible(true);
			}
			
			
			MoreConstructor mcInstance = null;
			int index = 0;
			WhileLabe:
			while (mcInstance == null) {
				try {
					switch (index) {
					case 0:
						mcInstance = (MoreConstructor)ct.newInstance();
						break;
					case 1:
						mcInstance = (MoreConstructor)ct.newInstance("Java", 10);
						break;
					case 2:
						Object[] paras = new Object[]{new String[]{"10", "11", "12"}};
						mcInstance = (MoreConstructor)ct.newInstance(paras);
						break;

					default:
						break WhileLabe;
					}
					
				} catch (Exception e) {
					System.out.println("在创建对象是抛出异常：");
					index++;
				}
			}
			index = 0;
			mcInstance.print();
			
			System.out.println("-----------------------------");
		}
		
		
		
		
		
		

	}

}
