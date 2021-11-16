package Codes;

import Codes.datas.Animal;

public class MainDrive {

	public static void main(String[] args) {

		TestClass tc = new TestClass();

		tc.pubStr = "문구"; // 정상 동작. -> public 권한 open

//		tc.priStr // 접근 불가. -> private : 해당 클래스에서만 사용. 		

		tc.proStr = "문구2"; // 정상 동작. -> protect 권한 OK

		Animal ani = new Animal();

//		ani.name protected는 남에게는 주지 않는다.

//		ani.name

//		ani.defStr default는 남에게는 주지 않는다.

//		ani.defStr

	}

}
