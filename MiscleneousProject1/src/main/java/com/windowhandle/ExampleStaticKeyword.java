package com.windowhandle;

public class ExampleStaticKeyword {
	int empId;
	String empName;
	static String empComp ="FIS";
	
	public ExampleStaticKeyword(int empId,String empName) {
		this.empId = empId;
		this.empName=empName;
	}
	public void display() {
		System.out.println(empId+" "+empName+" "+empComp);
	}

	public static void main(String[] args) {
		ExampleStaticKeyword e1 =new ExampleStaticKeyword(101,"rookie");
		e1.display();
		ExampleStaticKeyword e2 =new ExampleStaticKeyword(102,"rahim");
		e2.display();
	}
	

}
