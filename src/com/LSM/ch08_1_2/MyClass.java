package com.LSM.ch08_1_2;

public class MyClass {

	RemoteControl rc = new Television(); //필드

	public MyClass(RemoteControl rc) {
	this.rc = rc;
	}
	public void methodA() {
		RemoteControl rc = new Audio(); //인터페이스는 로컬변수로도 가능
	}
	
	public void methodB(RemoteControl rc) { //인터페이스는 매개변수로도 활용가능
		
	}
	
	
}
