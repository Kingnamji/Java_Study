
public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("Hello World"); // String
//		System.out.println('Hello World'); => Error, 자바에서는 작은 따옴표는 Character를 나타냄.
		System.out.println('H'); // Character
		System.out.println("H"); // String
		
		System.out.println("Hello "
				+ "World");
		
		// Escape
		System.out.println("Hello\nWorld"); // New Line
		System.out.println("Hello \"World\""); // Hello "World"
	}

}
