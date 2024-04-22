package designpattern.creational.Factory.impl;

import designpattern.creational.Factory.iterfaces.Button;

public class WindowsButton implements Button{

	@Override
	public String rednder() {
		return "Windows Button rendered";
	}

	@Override
	public String onClick() {
		return "Windows button clicked";
	}


}
