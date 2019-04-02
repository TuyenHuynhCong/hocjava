
public class Circle {
	private double radius=1.0;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius* radius;
	}
	public double getCircumference()
	{
		return 2*Math.PI* radius;
		
	}
	@Override
	public String toString() {
		return "Radius="+radius;
	}
	public static void main(String[] args)
	{
		Circle a=new Circle();
		System.out.println("Area= "+ a.getArea());
		System.out.println("Circumference= "+a.getCircumference());
		System.out.println("Circle= "+a.getCircumference());
	}
	
}
