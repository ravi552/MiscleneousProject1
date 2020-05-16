package com.staleelementreference;

public class Runner {

	public static void main(String[] args) {
		 TestClass2 t = new TestClass2();
		 t.college();
		 t.travel();
		 t.parent();
		 t.marrage();
		 t.childl();
		 System.out.println("******************************************");
		 TestClass t1 = new TestClass2();//upcasting
		 //t1.college();
		 //t1.travel();
		 t1.parent();
		 t1.marrage();
		 t1.childl();
		 
		 System.out.println("******************************************");
		 TestClass2 t2 = (TestClass2)t1;//downcasting
		 t2.college();
		 t2.marrage();
		 t2.parent();
		 t2.childl();
		 t2.travel();
		 
	}

}
