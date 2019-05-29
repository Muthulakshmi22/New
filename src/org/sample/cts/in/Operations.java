package org.sample.cts.in;

import java.io.File;

public class Operations {
public static void main(String[] args) throws Throwable {
	File f=new File("C:\\");
	File[] s = f.listFiles();
	for (File x : s) {
		System.out.println(x);
		
	}
	
}	
	
}

