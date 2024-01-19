package h_Chapter07;

//클래스 구조 - 변수, 메소드, 생성자

//! 생성자
// : 인스턴스(객체)가 생성될 때 호출되는 '인스턴스 초기화 메소드'
// : 인스턴스 변수의 초기화 작업에 주로 사용
// : 인스턴스 생성 시 실행되어야 하는 작업에 사용

//생성자 조건
// : 생성자 이름은 반드시 클래스 이름과 동일
// : 생성자는 리턴 값이 없음 - void 생략 가능

//생성자 기본 형태
// 클래스명(타입 변수명, 타입 변수 ....) {
// 		- 인스턴스 생성 시 수행될 코드 QR 인스턴스 변수 초기화
// }

// : 생성자는 인스턴스 생성 x
// : 연산자 new가 인스턴스를 생성

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	//자바 컴파일러가 제공하는 기본 생성자
	//: 매개변수 x, 아무런 내용 x
//	Data_2() { }
	
	//매개변수가 있는 정의 생성자
	//: 사용자 정의 생성자를 만드는 경우 컴파일러가 자동으로 기본 생성자 제거
	//: 컴파일러가 자동으로 기본 생성자를 추가하는 경우는 클래스 내에 생성자가 없을 때
	Data_2 (int x) {
		value = x;
	}
}

class Car {
	String color;
	String gearType; //변속기 종류 - auto(자동), manual(수동)
	int door; //문의 개수
	
	Car() {} //기본 생성자 - 차를 생성하고 추후 작업
	
	//정의 생성자에서 다른 생성자 호출 - this
	//: 생성자 간의 호출 사용
	//- 생성자의 이름으로 클래스 이름 대신 this 사용
	//- 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출 가능
	
	// 생성자 내에서 매개변수와 초기화하려는 인스턴스 변수의 이름이 동일한 경우
	// 변수이름의 구분을 위해 this 키워드 사용
	// - 객체 자신을 가리키는 참조 변수 this
	// this() 함수 - 해당 생성자 메소드를 가리킴
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(String color) {
		// 1. 첫 번째 줄 호출 이유
		//: 호출된 생성자가 변수값 초기화를 하는 경우
		//: 해당 생성자가 수행하려는 변수의 초기화가 무의미해지는 것을 방지
		this(color, "auto", 4);
		door = 5; //인스턴스 변수 초기화
//		Car(color, "auto", 4); // - 첫 번째 줄에서 호출 x / this 키워드 사용 x --> error
		
	}
	
	void displatInfo() {
		System.out.println(color + gearType + door);
	}
}

public class Constructor01 {

	public static void main(String[] args) {
		//생성자 없이 인스턴스 객체 생성
		//: 자바 컴파일러가 '기본 생성자'를 제공
		Data_1 d1 = new Data_1();
		//Data_2 d2 = new Data_2(); compile error - 실행 전 오류
		Data_2 d2 = new Data_2(5);
		
		//Car 클래스 사용
		Car c1 = new Car(); //사용자 정의 기본 생성자
		c1.color = "red";
		c1.door = 4;
		c1.gearType = "auto";
		c1.displatInfo();
		
		Car c2 = new Car("White", "auto", 2);
		c2.displatInfo();
		
		Car c3 = new Car("blue");
		c3.displatInfo();
		//매개변수 3개를 지저아는 생성자를 사용하여 객체의 틀을 정의하고
		//: 색상만 변경하고 싶은 경우 사용
		
		
		//객체 지향 프로그래밍의 this
		// 1. this
		// : 인스턴스 자신을 가리키는 참조 변수, 인스턴스의 주소가 저장되어 있음
		// : 모든 인스턴스 메소드에서 지역변수로 생략되어 존재
		
		// 2. this(), this(매개변수)
		// : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
		
	}

}
