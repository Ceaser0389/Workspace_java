package com.devJava.J_interfaces.ex03.devices;

public abstract class Device {

	public String serialNumber;



	public String getSerialNumber() {
		return serialNumber;
	}

	
	
	public Device(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}



	public abstract void processDoc(String doc);
	
}
