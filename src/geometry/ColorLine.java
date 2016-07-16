package geometry;
//comment
public class ColorLine extends Line implements Colorable{
	
	private String color;
	
	
	public ColorLine(Point startPoint, Point endPoint, String color){
		
		super(startPoint, endPoint);
		this.color = color;
	}
	
	public ColorLine(Line line , String color){
		
		super(line.getStartPoint(), line.endPoint);
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "ColorLine [" + super.toString()+" [color=" + color + "]";
	}
	
	
	
	
	

}
