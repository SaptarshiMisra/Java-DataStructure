package designpattern.creational.Factory;

import designpattern.creational.Factory.impl.LinuxDialog;
import designpattern.creational.Factory.impl.WindowsDialog;
import designpattern.creational.Factory.iterfaces.Dialog;

public class FactoryDesignApp {
	private Dialog dialog;
	
	public FactoryDesignApp(String env) {
		switch (env) {
		case "Windows":
			dialog= new WindowsDialog();
			break;
		case "Linux":
			dialog= new LinuxDialog();
			break;
		default:
			break;
		}
	}
	
	void render() {
		dialog.render();
	}
	
	public static void main(String[] args) {
		FactoryDesignApp factory = new FactoryDesignApp("Linux");
		factory.render();
	}

	
}
