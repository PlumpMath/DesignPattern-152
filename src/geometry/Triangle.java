package geometry;

public class Triangle extends Geometry{
	
	private Point A,B,C;
	
	private Line sideAB, sideBC, sideCA;
	
	
	public Triangle(Point A, Point B, Point C){
		super();
		
		this.A = A;
		this.B = B;
		this.C = C;
		
	}


	public Point getA() {
		return A;
	}


	public void setA(Point a) {
		A = a;
	}


	public Point getB() {
		return B;
	}


	public void setB(Point b) {
		B = b;
	}


	public Point getC() {
		return C;
	}


	public void setC(Point c) {
		C = c;
	}


	public Line getSideAB() {
		if(this.sideAB == null) this.sideAB = new Line(A,B);
		return sideAB;
	}


	public void setSideAB(Line sideAB) {
		this.sideAB = sideAB;
	}


	public Line getSideBC() {
		if(this.sideBC == null) this.sideBC = new Line(B,C);
		return sideBC;
	}


	public void setSideBC(Line sideBC) {
		this.sideBC = sideBC;
	}


	public Line getSideCA() {
		if(this.sideCA == null) this.sideCA = new Line(C,A);
		return sideCA;
	}


	public void setSideCA(Line sideCA) {
		this.sideCA = sideCA;
	}


	public String toString() {
		return "Triangle [A=" + A + ", B=" + B + ", C=" + C + "]";
	}
	
	/*
	 * 
	 * @return Square of triangle 
	 */
	public static int geroneSquare(Triangle triangle){

		int a = triangle.getSideAB().getLength();
		int b = triangle.getSideBC().getLength();
		int c = triangle.getSideCA().getLength();
		
		int p = (a + b + c) / 2;
		
		return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	/*
	 *@return max value of "x" coordinate in created triangle
	 */
	int getX(){
		
		if(this.A.getX() > this.B.getX() && this.A.getX() > this.C.getX()){
			return A.getX();
		}
		if(this.B.getX() > this.A.getX() && this.B.getX() > this.C.getX()){
			return B.getX();
		}
		if(this.C.getX() > this.B.getX() && this.C.getX() > this.A.getX()){
			return C.getX();
		}
		return 0;
	}
	/*
	 *@return max value of "y" coordinate in created triangle
	 */
	int getY(){
		
		if(this.A.getY() > this.B.getY() && this.A.getY() > this.C.getY()){
			return A.getY();
		}
		if(this.B.getY() > this.A.getY() && this.B.getY() > this.C.getY()){
			return B.getY();
		}
		if(this.C.getY() > this.B.getY() && this.C.getY() > this.A.getY()){
			return C.getY();
		}
		return 0;
	}	

}
