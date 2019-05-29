package org.sample.cts.in;

public class SubClass extends InheritanceCode {
public void comName() {
System.out.println("CTS");
}
public void comId() {
System.out.println("34567");
}
public static void main(String[] args) {
	SubClass g=new SubClass();
	g.comId();
	g.comName();
	g.empId();
	g.empName();
	
}
}
