package chap02;

public class Sample14 {

	public static void main(String[] args) {
		
		final float PI; //정의하지 않고 PI를 상수로 선언했다.
		PI = 3.14f; 	//최초 값을 선언한다. 이 후 PI값을 변경하면 오류가발생한다.
		//PI = 3.141592f //오류
		
		//final var PI2; // 오류
		
		int radius = 10;
		
		float area = radius * radius * PI;
		System.out.printf("원의 넓이 : %f",area );
		
	}

}
