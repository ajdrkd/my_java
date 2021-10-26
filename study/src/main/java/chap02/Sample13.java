package chap02;

import java.util.HashMap;
import java.util.Map;

public class Sample13 {

	public static void main(String[] args) {
//		var i = 365; //int i = 365;
//		System.out.println(i);
//		var j = 55l; //long j = 55l;
		
//		Map<String, String> map = new HashMap<String, String>();
//		var map2 = new HashMap<String, String>();
//		System.out.println(map2.toString());
		
//		var name = 1234; // 자료형을 추론할 때 리터럴이 없으면 추론할 수 없어서 에러가 발생;
		
		var name = "강현우";
		var age = 28;
		var height = 183.7f;
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
	}

}
