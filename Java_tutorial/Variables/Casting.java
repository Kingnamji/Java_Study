
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1; 
		double b2 = (double) 1; // 이걸 위 줄에선 자동으로 해 주는 
		System.out.println(b);
		System.out.println(b2);
		
		// int c = 1.1; => Error
		double d = 1.1;
		int e = (int) 1.1; // 명시적으로 1.1 을 int 형으로 바꿔줌 (손실 발생)
		System.out.println(d);
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass());
	}

}
