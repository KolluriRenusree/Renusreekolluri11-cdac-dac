package cdac;

public interface SmartDevice {
	public void turnOn();
	public void turnOff();
	public String getStatus();
	
	

}
class Light implements SmartDevice{
	int deviceid;
	boolean status;
	
	public Light(int deviceid, boolean status) {
		super();
		this.deviceid = deviceid;
		this.status = status;
	}
	@Override
	public void turnOn() {
		status=true;
		System.out.println("Light "+deviceid+" is turned ON ");
	}
	@Override
	public void turnOff() {
		status =false;
		System.out.println("Light "+deviceid+" is turned off");
		
	}
	@Override
	public  String  getStatus() {
		
		return "light "+deviceid + " status: "+(status?"ON":" OFF");
		
	}
	
	
}

	class Fan implements SmartDevice {
	    int deviceid;
	    boolean status;

	    public Fan(int deviceid) {
	        this.deviceid = deviceid;
	        this.status = true;
	    }

	    public void turnOn() {
	        status = true;
	        System.out.println("Fan " + deviceid + " is turned ON");
	    }

	    public void turnOff() {
	        status = false;
	        System.out.println("Fan " + deviceid + " is turned OFF");
	    }

	    public String getStatus() {
	        return "Fan " + deviceid + " status: " + (status ? "ON" : "OFF");
	    }
	}
	
	
	

