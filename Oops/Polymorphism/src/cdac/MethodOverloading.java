package cdac;

public class MethodOverloading {
	void print(String message) {
		System.out.println("Message: "+message);
		
	}
	void print(int number) {
		System.out.println("Number: "+number);
	}
	void print(double value) {
		System.out.println("Value: "+value);
	}
	void print(String[]items) {
		items= new String []{"java","c","c++"};
		System.out.println("String array");
		for(int i=0;i<items.length;i++) {
			System.out.print(items[i]+" ");
			
		}
		System.out.println();
		
		
		}
	void print(Object obj) {
		System.out.println("Object: "+obj.toString());
	}
	}
	

