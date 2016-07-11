package vehicle;

import java.util.Date;

public class Plane extends Vehicle{
	
	private int heigth;
	private int passangers;
	
	public Plane(int x, int y, int price, int speed, Date date,int heigth, int passangers){
		super(x,y,price,speed,date);
		this.heigth = heigth;
		this.passangers = passangers;
	}
	

	@Override
	int getX() {
		return x;
	}

	@Override
	void setX(int x) {
		this.x = x;
	}

	@Override
	int getY() {
		return y;
	}
	
	@Override
	void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Plane [heigth=" + heigth + ", passangers=" + passangers
				+ ", " + super.toString();
	}
	
	
	
}
