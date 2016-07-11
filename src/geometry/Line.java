package geometry;

public class Line extends Geometry{
	
	
	Point startPoint;
	Point endPoint;
	
	
	public Line(Point startPoint, Point endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	
	Line(int x1, int y1, int x2, int y2){
	
		this.startPoint = new Point(x1,y1);
		this.endPoint = new Point(x2,y2);  
		
	}


	public Point getStartPoint() {
		return startPoint;
	}


	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}


	public Point getEndPoint() {
		return endPoint;
	}


	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}


	public String toString() {
		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
	}
	
	
	
	public static int lengthOfLine(Point point1, Point point2){
		
		int X = (int) Math.pow((point2.getX() - point1.getX()), 2);
		int Y = (int) Math.pow((point2.getY() - point1.getY()), 2);
		
		
		return (int) Math.sqrt(X+Y);
	}
	
	private static int lengthOfLine(Line line){
		
		
		int X = (int) Math.pow((line.getEndPoint().getX() - line.getStartPoint().getX()), 2);
		int Y = (int) Math.pow((line.getEndPoint().getY() - line.getStartPoint().getY()), 2);
		
		return (int) Math.sqrt(X+Y);
	}
	
	public static int lengthOfLine(int x1, int y1, int x2, int y2){
		
		
		int X = (int) Math.pow((x2-x1),2);
		int Y = (int) Math.pow((y2-y1),2);
		
		return (int) Math.sqrt(X+Y);
	}
	
	public int getLength(){
		return lengthOfLine(this);
	}
	
	/*
	 *@return max value of "x" coordinate in created line
	 */
	public int getX(){
		
		return this.startPoint.getX() > this.endPoint.getX() ? startPoint.getX() : endPoint.getX() ;
		
	}
	/*
	 *@return max value of "y" coordinate in created line
	 */
	public int getY(){
		
		return this.startPoint.getY() > this.endPoint.getY() ? startPoint.getY() : endPoint.getY() ;
		
	}
	

}
