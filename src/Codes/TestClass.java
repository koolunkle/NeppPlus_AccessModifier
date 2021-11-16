package Codes;

public class TestClass {

	public String pubStr;

	protected String proStr;

	String defStr;

	private String priStr;

	void testMethod() {

//		private 변수는 이 클래스 안에서는 사용 가능.
//		다른 메소드 등에서 이용. 

		System.out.println(this.priStr);
	}

}
