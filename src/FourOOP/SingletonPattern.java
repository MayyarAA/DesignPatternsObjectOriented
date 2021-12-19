package FourOOP;

public class SingletonPattern {

	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();

		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();

		// show the message
		object.showMessage();
		
		object.increaseNum();
		System.out.println("object " + object.getNum());
		System.out.println("object2 " + object2.getNum());
	}

}

