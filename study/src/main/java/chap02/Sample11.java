package chap02;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  in = sc.nextLine(); // 한절을 모두 읽음
//		String  in2 = sc.next(); 띄어쓰기 단위로 읽음
		
		
//		int inNum1 = sc.nextInt();
//		long inLong = sc.nextLong();
//		char inChar = sc.next().charAt(0);
		
		System.out.printf("입력한 값 : %s\n글자 수 : %d",in.toUpperCase() , in.length());
		System.out.println();
		System.out.printf("입력한 값 : [%s]\n글자 수 : %d",in.toUpperCase().trim() , in.toUpperCase().trim().length());//.trim 
		sc.close();
		
		
	}

}
