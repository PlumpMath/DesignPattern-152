package vehicle;

import java.util.Date;

public class Ship extends Vehicle implements Swimable{
	
	
	private int port;
	private int passangers;
	
	public Ship(int x, int y, int price, int speed, int date, int port, int passangers){
		super(x, y, price, speed, date);
		this.port = port;
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
		return "Ship [port=" + port + ", passangers=" + passangers
				+ ", " + super.toString();
	}

	@Override
	public void swim() {
		System.out.println("Ship swim");
	}
}
