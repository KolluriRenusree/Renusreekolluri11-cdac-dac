package cdac;

public class MethodOverloadingMain {
	public static void main(String[] args) {
		MethodOverloading ml= new MethodOverloading();
		ml.print("Hello Cdac");
		ml.print(200);
		ml.print(477789.6d);
		ml.print(new String[]{});           // This will be overwritten inside the method anyway
		ml.print(new java.util.Date());
		
		
		
	}
	

}
