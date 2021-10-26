package chap02;

public class Sample01 {

	public static void main(String[] args) {
		int score = 100;
		score = score+200;
		System.out.printf("%d", score);
		System.out.println();
		boolean isExist = true;
		boolean hasClass = true;
		
		char chr = 'A';
		System.out.println("char : "+ chr); //문자	
		System.out.println("Incoding : " + (int)chr); //명시적 형변환
		System.out.println("Decoding : " + (char)65); //명시적 형변환
		
	}
}
