package org.sample.cts.in;

import java.util.*;

public class Orange {
public static void main(String[] args) {
	List<Objectuserdefined> li=new ArrayList<>();
	
	Objectuserdefined a=new Objectuserdefined();
	a.setId(1234);
	a.setName("kiruthiga");
	a.setPhno(23466666567l);
	
	Objectuserdefined b=new Objectuserdefined();
	b.setName("ramya");
	b.setId(5678);
	b.setPhno(9955557897l);
	
	li.add(a);
	li.add(b);
	
for (int i = 0; i < li.size(); i++) {
	
	System.out.println("id is"+ li.get(i).getId());
	System.out.println("Name is"+ li.get(i).getName());
	System.out.println("ph no is"+li.get(i).getPhno());
}	
	
}
}
