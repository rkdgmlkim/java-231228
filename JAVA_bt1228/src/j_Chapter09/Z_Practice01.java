package j_Chapter09;

// 다형성
// Animal, Cat, Dog 클래스
class AnimalChecker {
	void checkAnimalType(AnimalClass animal) {
		
	}
}
// Animal 클래스: sound 메소드(The animal makes a sound)
// Cat, Dog 클래스 - Animal 클래스 상속
// : sound 메소드를 오버라이딩 >> 각각 "meow", "bark" 출력

// instanceof 연산자
// : Animal, Cat, Dog 클래스를 사용하여 다형성을 확인하는 메소드 작성
// : checkAnimalType 메소드 - Animal 타입의 매개변수 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
// : Cat > 'cat' 출력 / Dog > 'dog' 출력 / 둘 다 x > 'Unknown animal type'

public class Z_Practice01 {

	public static void main(String[] args) {
		//Animal, Cat, Dog 클래스의 객체를 Animal 타입으로 저장
		//생성된 각 객체를 CheckAnimalType 메소드를 사용하여 확인
	}

}
