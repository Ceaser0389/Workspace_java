package com.devJava.J_interfaces.ex03.application;

import com.devJava.J_interfaces.ex03.devices.ComboDevice;
import com.devJava.J_interfaces.ex03.devices.ConcretePrinter;
import com.devJava.J_interfaces.ex03.devices.ConcreteScanner;

public class Program03 {

	public static void main(String[] args) {
	
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My letter");
			
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result" + s.scan());
		
		
		System.out.println();
		ComboDevice  c = new ComboDevice("2021");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
		

	}

}
