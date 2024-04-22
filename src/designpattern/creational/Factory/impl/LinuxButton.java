package designpattern.creational.Factory.impl;

import designpattern.creational.Factory.iterfaces.Button;

public class LinuxButton implements Button{

	@Override
	public String rednder() {
		return "This is Linux Button";
	}

	@Override
	public String onClick() {
		return "Linux Button clicked";
	}


}
