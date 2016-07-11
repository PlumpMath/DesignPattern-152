package geometry;

public class ColorTriangle extends Triangle{
	
	private String color;
	
	public ColorTriangle(Triangle triangle , String color){
		super(triangle.getA(),triangle.getB(),triangle.getC());
		this.color = color;
	}
	

	public ColorTriangle(Point A, Point B, Point C, String color) {
		super(A,B,C);
		this.color = color;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "ColorTriangle [" + super.toString() +" color=" + color +"]";
	}
	
	

}
