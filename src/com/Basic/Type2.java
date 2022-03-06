package com.Basic;

public class Type2 extends Type1{

public void emailID() {
	super.emailID();
	System.out.println("dina.ism@gmail.com");
}

@Override
	public void userName() {
		super.userName();
System.out.println("Dinesh");
}

@Override
	public void passWord() {
		super.passWord();
		System.out.println("123415");
	}


public static void main(String[] args) {
	
	Type2 a = new Type2();
	
	a.emailID();
	a.passWord();
	a.userName();

	
}
	}
	

