public class CasioGraph implements GraphCalculator {
	private Point point;
	private int batteryLevel;
	private boolean status;
	
	public CasioGraph(int x, int y) {
		batteryLevel = 100;
		status = false;
		point = new Point(x, y);
	}
	
	public int add(int a, int b) {
		if (this.getStatus()) {
			batteryLevel -= 10;
			this.checkBattery();
			return a + b;
		} else return -1;
	}
		
	public int substract(int a, int b) {
		if (this.getStatus()) {
			batteryLevel -= 10;
			if (batteryLevel <= 0) status = false;
			return a - b;
		} else return -1;
	}
	 
	public int multiply(int a, int b) {
		if (this.getStatus()) {
			batteryLevel -= 10;
			if (batteryLevel <= 0) status = false;
			return a * b;
		} else return -1;
	} 
	
	public double divide (int a, int b) {
		if (this.getStatus()) {
			batteryLevel -= 10;
			if (batteryLevel <= 0) status = false;
			return (double) a / (double) b;
		} else return -1.0;
	}
	
	public void shiftX(int shiftCount) {
		if (this.getStatus()) {
			batteryLevel -= 10;
			if (batteryLevel <= 0) status = false;
			point.setX(point.getX() + shiftCount);
		}
	}
	
	public void shiftY(int shiftCount) {
		if (this.getStatus()) {
			batteryLevel -= 10;
			if (batteryLevel <= 0) status = false;
			point.setY(point.getY() + shiftCount);
		}
	} 
	
	public double distance(int x, int y){
		if (this.getStatus()) {
			batteryLevel -= 10;
			if (batteryLevel <= 0) status = false;
			return Math.sqrt((x - point.getX()) * (x - point.getX()) + (y - point.getY()) * (y - point.getY()));
		}
		return -1.0;
	}
	
	public void start() {
		if (batteryLevel > 0) status = true;
	}
	public void stop() {
		status = false;
	}
	
	public int checkBattery() {
		return batteryLevel;
	}
		
	public boolean getStatus() {
		return status;
	}
	public Point getPoint() {
		return point;
	}
	public void charge() {
		batteryLevel = 100;
		status = true;
	}
	
}
