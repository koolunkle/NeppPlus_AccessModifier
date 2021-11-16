package Codes.datas;

import Codes.TestClass;

//TestClass의 자녀
//같은 패키지 X, 다른 집에 사는 자녀.

public class TestClassChildOutHome extends TestClass {

	void test() {

//		public 테스트

		System.out.println(pubStr);

//		protected 테스트

		System.out.println(proStr); // 따로 사는 자식에게도 물려준다.

//		(default) 테스트

//		System.out.println(defStr); // 따로 사는 자식에게는 허용 X.

//		private 테스트

//		System.out.println(priStr); // private은 상속 안해줌.
	}

}