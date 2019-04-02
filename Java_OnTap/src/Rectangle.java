
public class Rectangle {
	private float length =3.0f;
	private float width  =2.0f;
	public Rectangle(float length, float width) {
		//super();
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public 	double getArea() {
		return length*width;
	}
	public  double getPerimeter()
	{
		return (length+width)*2.0f;
	}
	@Override
	public String toString() {
		return "Length="+ length +",width="+width;
	}
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		System.out.println("Area= "+r.getArea());
		System.out.println("Perimeter= "+ r.getPerimeter());
		System.out.println("Length= "+r.getLength()+", width ="+r.getWidth());
	}
	
}



