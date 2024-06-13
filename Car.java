package dk.com;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	

	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}                                      //source_generate getter and setter

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
}
