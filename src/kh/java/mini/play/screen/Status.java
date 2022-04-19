package kh.java.mini.play.screen;

import java.util.Scanner;

import kh.java.mini.play.CleanStore;
import kh.java.mini.play.EatDrink;
import kh.java.mini.play.NowStatus;
import kh.java.mini.play.ReceiveOrder;
/**
 * 위쪽에 항상 등장해야할 화면 함수
 */
public class Status {
	
	NowStatus ns; // 공유객체
	ReceiveOrder rcvOrder;
	CleanStore cleanstore;
	EatDrink eatdrink;
	Exit exit;
	
	public Status(NowStatus ns) {
		this.ns = ns;
		this.rcvOrder = new ReceiveOrder(this, ns);
		this.cleanstore=new CleanStore(this,ns);
		this.eatdrink=new EatDrink(this,ns);
		this.exit=new Exit(this,ns);
	}

//	public static void main(String[] args) {
//		Status run = new Status();
//	}
	
	public void status() {
		
		System.out.println("======================================================\n"
							+ "              	    KH SANDWICH            	  \n"
							+ "======================================================");
	
		System.out.printf("	현재 매장 청결도는 [ %s ]점 입니다.%n",ns.getNowClean());
		System.out.printf("	현재 고객 만족도는 [ %.1f ]점 입니다.%n",ns.getNowSatis());
		System.out.printf("	현재 플레이어의 체력은 [ %s ] 입니다.%n",ns.getNowHp());
		System.out.printf("	현재 매장 매출액은 [ %.2f ]만원 입니다.%n",ns.getNowMoney());
		System.out.println("-------------------------------------------------------");
		
		
	}
	public void choicePlay() {
		
		System.out.println(" 	[1] 청소하기");
		System.out.println(" 	[2] 체력 보충하기");
		System.out.println(" 	[3] 주문 진행하기");
		System.out.println(" 	[4] 게임 종료하기");
		System.out.println("-------------------------------------------------------");
		System.out.printf(">>>>>>>> 번호를 입력해주세요. : %n");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch(choice) {
		case "1":cleanstore.cleanStore();break;
		case "2":eatdrink.eatDrink();break;
		case "3":rcvOrder.rdReceive();break;
		case "4":exit.gameResult();exit.gameExit();break;
		default:System.out.println(">>>>>>>> 화면의 값 중에서 입력하세요");break;
		}
	}



}
