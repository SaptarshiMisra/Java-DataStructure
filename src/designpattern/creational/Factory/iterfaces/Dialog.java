package designpattern.creational.Factory.iterfaces;

public abstract class Dialog {
 public abstract Button createButton();
 
 public void render() {
	 Button button = createButton();
	 System.out.println(button.rednder());
	 System.out.println(button.onClick());

 }
}
