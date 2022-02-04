import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt"); // PrintWriter라는 클래스의 instance => p1
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt"); // PrintWriter라는 클래스의 instance => p1
		p2.write("Hello 2");
		p2.close();

	}

}
