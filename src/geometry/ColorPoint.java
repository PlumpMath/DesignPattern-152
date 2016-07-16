package geometry;

public class ColorPoint extends Point implements Colorable{
	
	private String color;
	
	public ColorPoint(int x, int y, String color){
		
		super(x, y);
		this.color = color;
	
	}
	
	ColorPoint(Point point, String color){
		
		super(point.getX(),point.getY());
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Color"+super.toString()+" [color=" + color + "]";
	}
	
	

}
