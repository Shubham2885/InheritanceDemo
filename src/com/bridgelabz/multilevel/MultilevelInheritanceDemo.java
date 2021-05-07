package com.bridgelabz.multilevel;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

//		C c = new C();
		
		D d = new D();
		C c = new C();
		
		d.methodD();
		d.methodC();
//		c.methodC();
//		
//		c.methodA();
	}

}
