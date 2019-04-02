package Model;

public class Cylinder extends Circle {
	private double height=1.0;

	public Cylinder() {
		super();
		this.height=height;
	}

	public Cylinder(double height) {
		super();
		this.height=height;
		
		// TODO Auto-generated constructor stub
	}
     
	public Cylinder(double radius, double height) {
		super(radius);
		this.height=height;

	}

	public Cylinder(double radius, String color,double height) {
		
		super();
		this.height=height;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume()
	{
		return getArea() * height;
	}
		
	
	

}
