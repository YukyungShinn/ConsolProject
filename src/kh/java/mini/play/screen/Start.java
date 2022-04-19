package kh.java.mini.play.screen;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void start() {
		System.out.println("======================================================\n"
							+ "              	    KH SANDWICH            	  \n"
							+ "======================================================");
		
		System.out.println("\t > 매출액 20만원 달성시 게임이 종료된다.\n"
				+ "\t > 플레이어는 손님이 주문한 대로 샌드위치와 음료를 만든다.\n"
				+ "\t > 매출액 20만원 달성시      [게임승리]\r\n"
				+ "\t > 플레이어 체력 소진시       [게임패배]\r\n"
				+ "\t > 고객만족도 0에 도달시      [게임패배]");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("[체력] 		기본체력 		( 80 )\n"
							+ "		샌드위치 제조시 	( - 5 )\n"
							+ "		음료 제조시 	( - 3 )\n"
							+ "		음료&샌드위치 제조시 ( - 10 )\n"
							+ "		에너지드링크 섭취시 	( + 20 / - 1만원 )");
		System.out.println("-------------------------------------------------------");
		System.out.println("[매장 청결도]	기본 청결도 	(80)\n"
									+ "		포장주문시 	    ( -0 )\n"
									+ "		매장취식시 	    ( -5 )\n"
									+ "		매장청소시		( +10 )");
		System.out.println("-------------------------------------------------------");
		System.out.println("[고객만족도] 	기본 만족도 	( 50 )	\n"
								+ "		주문 성공시 	( + 10 * 현재청결도)\n"
								+ "		주문 실패시 	( - 10 * 현재청결도)");
		System.out.println("-------------------------------------------------------");	
		System.out.println();
		System.out.print(">>>>>>>> 게임을 시작합니다. 아무키나 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String start = sc.next();
	}
}
