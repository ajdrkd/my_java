package chap02;

public class Sample16 {
	/**
	 * 실행 메서드입니다.
	 * @param args 난수값
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*3+1);
		System.out.printf("난수:%d",num); 
		}
	
	/**
	 * 코드 템플릿입니다.
	 * @param in 입력값
	 * @return   출력값
	 */
	public int getValue(int in) {
		return in;
	}

	/**
	 * 연습
	 * @param in 입력
	 * @return   출력
	 * @since 1.0
	 * 2021. 10. 27.
	 */
	public int getValue2(int in) {
		return in;
	}
}
