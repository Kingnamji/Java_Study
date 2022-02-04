
public class BytesOfType {
	// 기본 데이터 타입의 바이트 수를 확인
	// 기본 데이터 타입 (Primitive Data Types)
	// => boolean, char, byte, short, int, long, float, double

	public static void main(String[] args) {
		System.out.println("How many Bytes?");
		// 1 Byte
		System.out.println("byte : " + Byte.BYTES);
		
		// 2 Bytes
		System.out.println("char : " + Character.BYTES);
		System.out.println("Short : " + Short.BYTES);
		
		// 4 Bytes
		System.out.println("int : " + Integer.BYTES);
		System.out.println("float : " + Float.BYTES);
		
		// 8 Bytes
		System.out.println("long : " + Long.BYTES);
		System.out.println("double : " + Double.BYTES);

	}
}