package chap04;

public class Sample08 {

	/**
	 * 삼항연산자
	 * @param args
	 * @since 1.0
	 * 2021. 10. 27.
	 */
	public static void main(String[] args) {
		
		//3항연산자
		// (조건식) ? A : B
		int number = 6;
		String result = ((number & 2) == 0 ) ? "even" : "odd";
		System.out.println(result + " " + number);
		
	}

}
