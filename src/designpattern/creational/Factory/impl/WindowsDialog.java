package designpattern.creational.Factory.impl;

import designpattern.creational.Factory.iterfaces.Button;
import designpattern.creational.Factory.iterfaces.Dialog;

public class WindowsDialog extends Dialog{

	@Override
	public Button createButton() {
		WindowsButton windowsButton = new WindowsButton();
		return windowsButton;
	}


}
