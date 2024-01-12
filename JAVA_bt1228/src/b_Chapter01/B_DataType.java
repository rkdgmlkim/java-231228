package b_Chapter01;

public class B_DataType {
	
	public static void main(String[] args) {
		// 데이터 타입(자료형, DataType)
		// : 자바는 강 타입 언어로, 모든 변수 선언 시 데이터 타입을 명시!
		
//		1. 데이터 타입의 종류
//		: 기본 타입, 참조 타입
//		- 기본 타입: 자바에서 미리 정의된, 기본적인 타입
//					변수를 선언하면 해당되는 자료형의 크기 만큼 메모리 할당
//		- 참조 타입: 객체의 참조(메모리 주소)를 저장하는 변수 타입
		
//		2. 기본 자료형
//		: 총 8가지 기본형 타입

//		2-1. 정수 타입(8비트 == 1바이트)
//		byte: 1바이트 정수 - 값의 범위(-128 ~ 127)
//		short: 2바이트 정수 - 값의 범위(-32,768 ~ 32,767)
//		int*(기본): 4바이트 정수 - 값의 범위(약-2.1억 ~ 약2.1억)
//		long: 8바이트 정수 - 값의 범위(약-2의 63제곱 ~ 약-2의 63제곱)
		int age;
		age = 27;
		System.out.println(age);
		
//		long 데이터 타입은 숫자 뒤에 알파벳 L 또는 l을 써서 long형임을 표시
		@SuppressWarnings("unused")
		long apartmentPrice = 1000000000L;
		
//		2-2. 문자형
//		char*: 하나의 문자를 저장하기 위한 변수를 선언할 때 사용
//		- 문자형의 데이터의 경우 따옴표를 사용해 감싸야 함
//		- 2바이트
		@SuppressWarnings("unused")
		char grade = 'A';
		@SuppressWarnings("unused")
		char lastName = '이';
		
//		2-3. 실수형(부동소수점 타입): 소수점 자리가 있는 수
//		float: 4바이트 소수점, 숫자 뒤에 알파벳 F를 써서 float형임을 표시
//		double*(기본): 8바이트 소수점. 기본 실수 타입
		float height = 169.2F;
		double price = 19.3;
		
//		2-4. 논리형*: 데이터 값으로 true(참), false(거짓)만 담을 수 있음
//		- 1바이트
//		- 값이 존재하는지, 결과가 참인지 거짓인지 등을 표현
//		- 소문자 값 사용을 권장
//		- is키워드를 사용하여 해당 여부가 참인지 거짓인지 등을 표현
		@SuppressWarnings("unused")
		boolean isMarried = false;
		@SuppressWarnings("unused")
		boolean isActived = true;
		
//		3. 참조 자료형
//		: 기본 자료형을 기초로 만들어진 자료형
//		: 실제 값을 갖는 것이 아닌 
//		: , 데이터가 저장된 메모리의 '주소 값'을 가지는 자료형
//		- 종류
//			: String 문자열을 저장하는 데 사용되는 참조 자료형
//			: Array 배열을 나타내는 참조 자료형
	}
}