package cdac;

import java.util.*;
public class Employee1 {
    int Empno;
    String name;
    float sal;
    String designation;

    

public void getEmployee1Data(Scanner sc){
    //Scanner sc=new Scanner(System.in);
    Empno=sc.nextInt();
    name=sc.next();
    sal=sc.nextFloat();
    designation=sc.next();
    //sc.close();
}
public void displayEmployee1(){
    System.out.println(Empno);
    System.out.println(name);
    System.out.println(sal);
    System.out.println(designation);
    
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("First Object: ");
    Employee1 e=new Employee1();
    e.getEmployee1Data(sc);
    //e.displayEmployee1();
    Employee1 e1=new Employee1();
    System.out.println("second Object: ");
    e1.getEmployee1Data(sc);
   // System.out.println("second Object: ");
   //121 Employee1 e1=new Employee1();
    //e1.getEmployee1Data(sc);
    e.displayEmployee1();
    e1.displayEmployee1();
    sc.close();
}
    
}

