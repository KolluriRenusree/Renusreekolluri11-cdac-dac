package cdac;

public class EmployeePayrollSystem {
	int emid;
	String name;
	double basicsalary;
	


EmployeePayrollSystem(int emid,String name,double basicsalary){
	this.emid=emid;
	this.name=name;
	this.basicsalary=basicsalary;
}
	  double calculateGrossSalary() {
		 double HRA=0.2*basicsalary;
		 double DA =0.1*basicsalary;
		 return basicsalary + HRA + DA;
	 }
	public void  display(){
		  System.out.println(emid);
		  System.out.println(name);
		  System.out.println(basicsalary);
		  System.out.println(calculateGrossSalary());
	  }
		
}

