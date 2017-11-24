import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MoreFields {
	
	int i = 0;
	public float f = 0.0f;
	protected boolean b = false;
	private String s = "";
	
	static private double si = 0;
	

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		MoreFields mf = new MoreFields();
		
		Field[] fields = MoreFields.class.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			
			System.out.println("变量名：" + f.getName());
			
			Class<?> fCla = f.getType();
			System.out.println("变量的类型：" + fCla);
			
			int md = f.getModifiers();
			System.out.println("变量的权限控制: " + Modifier.toString(md));
			if (Modifier.isPrivate(md)) {
				f.setAccessible(true);
			}
			
			System.out.println("默认值：" + f.get(mf));
			
			if (fCla.equals(int.class)) {
				f.set(mf, 10);
			} else if (fCla.equals(float.class)) {
				f.set(mf, 11.0f);
			} else if (fCla.equals(boolean.class)) {
				f.set(mf, true);
			} else if (fCla.equals(String.class)) {
				f.set(mf, "str");
			} else if (fCla.equals(double.class)) {
				f.set(mf, 12.0);
			}					
			System.out.println("重新设置后的值：" + f.get(mf));
			
			System.out.println("-----------------------");
		}
	

	}

}
