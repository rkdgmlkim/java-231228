package g_Chapter06;

//사칙연산 클래스
//: 두 개의 값을 매개변수로 전달받아 사칙연산 수행
//: add, subtract, multiply, divide의 4개의 메소드
class MyMath {
	int add(int a, int b) { return a + b; }
	int subtract(int a, int b) { return a-b;}
	int multiply(int a, int b) { return a*b;}
	int divide(int a, int b) { return a/b;}
}

void noReturn() {
	System.out.println("해당 메소드는 반환값이 없습니다");
	return; //반환 타입이 void 이기 때문에 생략 가능 - 컴파일러가 자동 추가
}

void yesReturn() {
	String msg = ("해당 메소드는 반환값이 있습니다");
	//반환타입이 void가 아닌 경우 return문 작성 생략 시 오류 발생
//  return msg;
}

public class Method03 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		//메소드의 실행 흐름
		//1. main 메소드에서 메소드 add를 호출 - 인자를 매개변수에 전달
		//2. 메소드 add 내에서 중괄호{} 구현부 내의 문장이 순서대로 수행
		//3. 메소드 add의 모든 문장이 실행하거나 return문을 만나면
		//   호출된 메소드(main)로 돌아와 이후 문장을 실행
		//	 반환된 값을 value 변수에 할당
		//	 함수가 void 타입으로 바로 출력하는 경우 console창에 출력
		int value = mm.add(10, 20); //메소드 호출
		int value2 = mm.subtract(20, 10);
		int value3 = mm.multiply(5, 3);
		int value4 = mm.divide(5, 3);
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//return문
		//: 현재 실행중인 메소드를 종료하고 호출한 메소드로 돌아감
		//: 반환값의 유무에 관계없이 모든 메소드에는
		//: 적어도 하나 이상의 return문이 존재해야함
		// - 자바 컴파일러가 메소드의 마지막에 자동으로 return; 추가
	}

}
