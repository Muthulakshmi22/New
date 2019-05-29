package org.sample.cts.in;

public class MethodOverloading {
//methodoverloading code
//datatype
	public void empId(String name) {
System.out.println(name);
	}
public void empId(int id) {
System.out.println(id);
	}
//datatypecount
public void empId(float salary ,long mobile,String email) {
System.out.println(salary);
System.out.println(mobile);
System.out.println(email);
}
//datatype order
public void empId(boolean female , int pincode , double allowances) {
	System.out.println("BID method" +female+"\t"+pincode+"\t"+allowances);

}
	
	public static void main(String[] args) {
		MethodOverloading g=new MethodOverloading();
	g.empId("MuthulakshmiV");
	g.empId(987650);
	g.empId(35000f, 9955678934l, "a@a.com");
g.empId(true, 6410097, 987.65);

		
	}
}

	

