package cdac;

public class TestSmartDevice {
	public static void main(String[] args) {
		
		Light l=new Light(101,false);
		Fan f=new Fan(102);
		l.turnOn();
		System.out.println(l.getStatus());
		l.turnOff();
		System.out.println(l.getStatus());
		f.turnOn();
		System.out.println(f.getStatus());
		f.turnOff();
		System.out.println(f.getStatus());
		
		
		
		
		
	}

}
