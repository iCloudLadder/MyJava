package MyClass;


public class MyCompare implements Comparable<MyCompare> {
	private int  id;
	private String name;
	private int age;
	
	public MyCompare(int id, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(MyCompare o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "id =" + id + ", name = " + name + ", age = " + age;
	}
	
	public static void main(String[] args) {
		

	}

}


