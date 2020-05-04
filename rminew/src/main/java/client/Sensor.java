package client;

public class Sensor {
	
	String sensorName;
	String floorNo;
	String roomNo;
	String cO2;
	String smoke;
	public Sensor(String sensorName, String floorNo, String roomNo, String cO2, String smoke) {
		super();
		this.sensorName = sensorName;
		this.floorNo = floorNo;
		this.roomNo = roomNo;
		this.cO2 = cO2;
		this.smoke = smoke;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public String getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getcO2() {
		return cO2;
	}
	public void setcO2(String cO2) {
		this.cO2 = cO2;
	}
	public String getSmoke() {
		return smoke;
	}
	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}
	
	

}
