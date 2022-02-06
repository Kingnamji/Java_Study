import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 구별해 입력하시오.");
		
		String name, city;
		int age, weight;
		boolean marriage;
		
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		city = scanner.next();
		age = scanner.nextInt();
		weight = scanner.nextInt();
		marriage = scanner.nextBoolean();
		
		System.out.println("이름 : " + name);
		System.out.println("도시 : " + city);
		System.out.println("나이 : " + age);
		System.out.println("체중 : " + weight);
		System.out.println("독신 여부 : " + marriage);
		
		
		scanner.close();

	}

}
