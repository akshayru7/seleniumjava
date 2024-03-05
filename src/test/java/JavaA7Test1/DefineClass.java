package JavaA7Test1;

import JavaA7Test.ExceptionHandlingInJava;
//import JavaA7Test.Interface;
//import JavaA7Test.*;
//import java.lang.String;
//import java.lang.System;
//import java.util.ArrayList;
//import java.util.Map;
//import java.awt.Button;
//import java.applet.*;

public class DefineClass {

	public static void main(String[] args) throws ArithmeticException, NullPointerException{

		//Interface f = new Interface();
		//Bank m = new Bank();
		//m.createaccount();
		//JavaA7Test.BeanClass c = new JavaA7Test.BeanClass();
		int b = 2;
		int a = 0;
		ExceptionHandlingInJava e = new ExceptionHandlingInJava(a, b);
		e.fetchmoney(2, 4);
	}

}
