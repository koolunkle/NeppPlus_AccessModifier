package Codes;

public class TestClassChildInHome extends TestClass {

	void test() {

//		protected 변수를 끌어다는 쓰는 테스트. 

		System.out.println(proStr);

//		public 은 상속으로도 내려준다. 

		System.out.println(pubStr);

//		default (기본) 테스트

		System.out.println(defStr);

//		private : 상속으로도 물려주지 않는다. 

//		System.out.println(priStr);

	}

}