package d_Chapter03;

import java.util.Random;
import java.util.Scanner;

public class C_Array03 {

	public static void main(String[] args) {
		//가위바위보 게임
		//사용자가 가위바위보 중 하나 선택
		//컴퓨터도 동일하게 무작위로 하나 선택하여 승패 결정
		
		//사용자로부터 입력을 받는 Scanner 객체
		Scanner sc = new Scanner(System.in);
		//컴퓨터의 무작위 난수를 생성하는 Random 기능
		Random rd = new Random();
		
		//가위바위보 배열
		String[] choices = {"가위", "바위", "보"};
		//사용자와 컴퓨터의 선택을 저장할 String 변수 각각 선언
		String userChoice;
		String computerChoice;
		
		//컴퓨터가 선택할 항목의 인덱스를 저장하는 변수
		//: Choices 배열(0~2인덱스)에서 무작위 선택
		int computerChoiceIndex;
		
		//무한루프
		while(true) {
			System.out.println("가위, 바위, 보 중 하나를 선택하세요");
			System.out.println("게임 종료를 원하면 '종료'를 입력하세요");
			
			//사용자의 입력을 읽어, userChoice 변수에 저장
			userChoice = sc.nextLine();
			
			//a.equals(b): a와 b가 일치하면 true, 그렇지 않으면 false
			if(userChoice.equals("종료")) {
				//종료를 입력하면 루프 탈출
				break;
			}
			
			// 컴퓨터의 선택
			// 0부터 choices 배열의 길이 -1 사이의 무작위 수 생성
			// Sc.nextInt, sc.nextDouble, sc.nextLine 처럼 
			// random.nextInt() : 0부터 n-1 사이에서 무작위 수를 찾아냄
			// - Choices 배열의 요소 중에 0~2까지의 인덱스 번호를 무작위 추출
			computerChoiceIndex = rd.nextInt(choices.length); //0부터 2까지
			
			// 베열의 요소에 접근: 배열명[요소의인덱스번호]
			computerChoice = choices[computerChoiceIndex];
			
			//승패 결정 로직
			//승리
			if((userChoice.equals("가위") && computerChoice.equals("보"))
					 || (userChoice.equals("보") && computerChoice.equals("바위"))
					 || (userChoice.equals("바위") && computerChoice.equals("가위"))
					 ) {
				System.out.println("이겼습니다");
			} else if (userChoice.equals(computerChoice)) {
				System.out.println("비겼습니다");
			} else {
				System.out.println("졌습니다");
			}
		}
		sc.close();
		System.out.println("게임을 종료합니다");

	}

}
