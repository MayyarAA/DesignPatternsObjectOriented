package FourOOP;

public class SingleObject {

	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();
	int num;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
		this.num = 0;
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public static void increaseNum() {
		System.out.println("instance num before " + instance.num);
		instance.num++;
		System.out.println("instance num after " + instance.num);
	}

	public static int getNum() {
		return instance.num;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
