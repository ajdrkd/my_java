package chap04;

public class Sample01 {

	/**
	 * 산술 연산자
	 * @param args
	 * @since 1.0
	 * 2021. 10. 27.
	 */
	public static void main(String[] args) {
		//사과 10개가 있습니다
		int apples = 10; 
		
		//2명의 친구가 있습니다.(총 3명)
		int people = 2+1;
		
		//사과을 나눠 먹으면
		int remainder = apples % people;
		
		//몇개의 사과가 남을까요
		System.out.println("나머지::" + remainder);
		
	}

}
