package i_Chapter08;

// import 패키지명.클래스명
import i_Chapter08.AccessExample;

public class OtherClass {
	public static void main(String[] args) {
		// 외부 패키지의 클래스를 사용한 객체 인스턴스화
		AccessExample example = new AccessExample();
		System.out.println(example.publicVar);
//		System.out.println(example.protectedVar);
//		System.out.println(example.defaultVar);
//		System.out.println(example.privateVar);
		
		//public 메소드를 통해 AccessExample 내의 제한된 변수에 접근 가능
		example.showAccess(); //public
//		example.showProtected();
//		example.showDefault();
//		example.showPrivate();
		
	}

}
