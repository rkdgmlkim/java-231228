package g_Chapter06;

//(메소드) 오버로딩
//: 한 클래스 내에 같은 이름의 메소드를 여러 개 정의하는 것

//오버로딩의 규칙
// 1. 메소드 이름이 같아야 함
// 2. 매개변수의 개수 또는 타입이 달라야 함
// 3. 반환 타입은 관계 없음

//오버로딩의 장점
//: 사용자가 매개변수의 순서를 외우지 않아도 편리하게 사용 가능

//오버로딩의 단점
//: 오버로딩 메소드를 중복으로 의미 없이 생성하는 경우 필요한 구현의 메소드를 찾기 어려움

//오버로딩 사용 이유
// 1. 메소드가 수행하는 기본적인 작업이 동일할 때, 같은 이름 사용 가능
//: - 코드를 명확하고 가독성 있게 작성 가능
// 2. 코드의 재사용성이 높아짐
// 3. 컴파일 시 타입 체크를 강화 - 올바른 매개변수 타입을 가진 메소드를 선택



class Calculator {
	int a, b;
	//int x, y;
	double x,y;
	
	//두 정수(a, b)를 더하는 메소드
	int add(int a, int b) { return a+b; }
	
	//두 정수(x, y)를 더하는 메소드
	//: 실제 값의 차이 여부와 반환타입의 차이 여부는 오버로딩과 관련 x
	//: 반드시 개수 또는 타입이 달라야 함
	// int add(int x, int y) { return x+y; } - Error
	
	double add(double x, double y) {return x+y;}
	
	double add(int a, double y) {return a+y;}
	
	double add (double x, int b) {return x+b;}
}

public class Overloading01 {

	public static void main(String[] args) {
		int num = 1;
		String msg = "안녕하세요";
		boolean bool = false;
		//자바 출력문
		System.out.println(num);
		System.out.println(msg);
		System.out.println(bool);

	}

}
