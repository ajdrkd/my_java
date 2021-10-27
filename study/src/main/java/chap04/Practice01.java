package chap04;

import java.util.Iterator;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		//1. 두 개의 값을 입력받아서 큰 수를 출력하세요 (단, 같으면 0으로 출력)
			System.out.print("a : ");
			int test01_a = sc.nextInt();
			System.out.print("b : ");
			int test01_b = sc.nextInt();
			int result = (test01_a > test01_b) ? test01_a : (test01_a == test01_b) ? 0 : test01_b;
			System.out.println("문제의 답은  " + result);
			System.out.println("------------------------------------");
		
		//2. 100점 만점의 학점을 입력받아서 90점이상이면 A, 80점이상이면 B, 70점이상이면 C, 60점이상이면 D, 60점미만이면 F 를 구하는 프로그램을 작성하세요(입력받는 점수는 0점에서 100점 사이입니다.)
			System.out.print("점수를 입력하세요 : ");
			int score = sc.nextInt();
			String result02 =(score > 100) ? "입력값이 100점보다 큽니다" :
								(score >= 90) ? "A" : 
									(score >= 80) ? "B" : 
										(score >= 70) ? "C" : 
											(score >= 60) ? "D" : "F";
			System.out.println(result02);										
			System.out.println("------------------------------------");
			
		//3. 다음 소스코드만 보고 값을 예측해서 실행된 값과 비교하세요.
			int a = 10;
			int b = 20;
			
			int r1 = ++a + ++b;
			System.out.println(r1); //32
			
			int r2 = a++ + b++;
			System.out.println(r2); //32
			
			int r3 = b++ - --a;
			System.out.println(r3); //30
			
			int r4 = --a + a--;
			System.out.println(r4); //18
			
			int r5 = b += ++a; // b = b + 10
			System.out.println(r5); //
			System.out.println("------------------------------------");
			
		
		//4. 정수의 값을 입력받고 입력받은 값이 양의 정수이면 그냥 출력하고 음의 정수이면 양의 정수로 변환하여 출력하세요
			
			System.out.print("a : ");
			int a4 = sc.nextInt();
			int result04 = ( a4 > 0 ) ? a4 : a4 * -1; 
			System.out.println(result04);
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
