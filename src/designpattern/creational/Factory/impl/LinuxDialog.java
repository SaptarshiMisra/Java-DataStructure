package designpattern.creational.Factory.impl;

import designpattern.creational.Factory.iterfaces.Button;
import designpattern.creational.Factory.iterfaces.Dialog;

public class LinuxDialog extends Dialog {

	@Override
	public Button createButton() {
		LinuxButton linuxButton = new LinuxButton();
		return linuxButton;
	}


}
