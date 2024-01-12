package e_Chapter04;

//게임 캐릭터 클래스(GameCharacter)
class GameCharcter {
	//이름(name), 레벨(level), 힘(strength) 속성
	String name;
	int level;
	double strength;
	
	void displayInfo() {
		System.out.println("Name: " + name + ", Level: " + level + ", Strength: " + strength);
		
	}
}

//캐릭터의 정보를 출력(displayInfo) 메소드
//- "Name" + name + ", Level: " + level + ", Strength: " + strength

//생성자 - 각 필드의 데이터를 초기화


public class Object05 {

	public static void main(String[] args) {
		//캐릭터 객체 생성
		//"Warrior", 10, 100 초기화
		GameChracter = new GameChracter("Warrior", 10, 100);
		
		charctor.displayInfo();

	}

}
