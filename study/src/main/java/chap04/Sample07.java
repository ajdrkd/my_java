package chap04;

public class Sample07 {

	/**
	 * 복합대입연산자
	 * @param args
	 * @since 1.0
	 * 2021. 10. 27.
	 */
	public static void main(String[] args) {
		int num1 = 3; //일반 연산
		int num2 = 3; //복합대입연산
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 + 3;
		num2 += 3;
		System.out.println("=== + 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 - 3;
		num2 -= 3;
		System.out.println("=== - 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 * 3;
		num2 *= 3;
		System.out.println("=== * 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num1 = num1 / 3;
		num2 /= 3;
		System.out.println("=== / 3");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

}
