package MyClass;

public class Cire implements ICalculate {
	
	@Override
	public float getArea(float r) {
		// TODO Auto-generated method stub
		return PI * r * r;
	}

	@Override
	public float getCircumference(float r) {
		// TODO Auto-generated method stub
		return 2 * PI * r;
	}
	
	public static void main(String[] args) {
		final float radius = 10.0f;
		Cire c = new Cire();
		System.out.println("Area of Cire c is:" + c.getArea(radius));
		System.out.println("Circumference of Cire c is:" + c.getCircumference(radius));

	}

}
