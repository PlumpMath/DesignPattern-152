package geometry;

import java.util.ArrayList;

public class MainClass {

	
	public static void main(String[] args) {

		/*
		 * Let's Create some test objects
		 */
		Point point1 = new Point(2, 2);

		ColorPoint point2 = new ColorPoint(5,6,"Red");
		ColorPoint point3 = new ColorPoint(point1, "Yellow");

		Line line2 = new Line(100,2,150,6);


		ColorTriangle triangle2 = new ColorTriangle(new Point(1,3),new Point(1111,2),new Point (2000, 3),"BLUE");


		// This is Array which could takes every objects who extends geometry's class
		ArrayList<Geometry> geometry = new ArrayList<>();

		// Fill our ArrayList
		geometry.add(point1);
		geometry.add(point2);
		geometry.add(point3);
		geometry.add(line2);
		geometry.add(triangle2);

		// Test methods
		System.out.println(getMaxX(geometry));
		System.out.println(getMaxY(geometry));
		isColor(geometry);
		aColor(geometry);

	}
	/*
	 *@param geo Geometry list which we create before
	 *@return Max value of "x" coordinate in Geometry ArrayList
	 */

	public static int getMaxX(ArrayList<Geometry> geo){

		ArrayList<Integer> X = new ArrayList<>();

		for (Geometry g : geo) {
			X.add(g.getX());
		}

		int maxX = X.get(0);

		for (Integer x : X) {
			if(x > maxX){
				maxX = x;
			}
		}
		return maxX;
	}

	/*
	 *@param geo Geometry list which we create before
	 *@return Max value of "y" coordinate in Geometry ArrayList
	 */
	public static int getMaxY(ArrayList<Geometry> geo){

		ArrayList<Integer> Y = new ArrayList<>();

		for (Geometry g : geo) {
			Y.add(g.getY());
		}

		int maxY = Y.get(0);

		for (Integer y : Y) {
			if(y > maxY){
				maxY = y;
			}
		}
		return maxY;
	}

	/*
	 * This Method print in console every Color geometry
	 * Also method print count of color figures
	 */
	public static void isColor(ArrayList<Geometry> geo){
		int count = 0;

		System.out.println("This is colored Geometry ");
		for (Geometry g : geo) {
			if(g instanceof ColorPoint){
				System.out.println(g);
				count++;
			}
			if(g instanceof ColorLine){
				System.out.println(g);
				count++;
			}
			if(g instanceof ColorTriangle){

				System.out.println(g);
				count++;
			}
		}
		System.out.println(count);
	}
	/**
	 * The same as isColor method, add object which implements Colorable interface to new ArrayList colorGeo
	 */
	public static void aColor(ArrayList<Geometry> geo) {
		ArrayList<Colorable> colorGeo = new ArrayList<>();
		int count=0;
		for (Geometry figure : geo) {
			if(figure instanceof Colorable){
				colorGeo.add((Colorable) figure);
				count++;
			}
		}
		for (Colorable c: colorGeo) {
			System.out.println(c.getColor());
		}
		System.out.println(count);
	}


}
