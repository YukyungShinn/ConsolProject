package kh.java.mini.play.screen;

import java.util.Scanner;

import kh.java.mini.play.NowStatus;
/**
* 
* 게임을 종료하는 메소드들
* 
* 1. 만족도 0이어서 게임 종료
* 2. hp 0이어서 게임 종료
* 3. 게임 종료버튼 눌러서 게임 종료
* 세가지 메소드 만들기
*
*/
public class Exit {
	NowStatus ns;
	Status status;
	
	
    public Exit(Status status, NowStatus ns) {
    	this.status=status;
		this.ns=ns;
	}

    public void moneyZero(){
    	System.out.println();
    	System.out.printf("_________________\r\n"
    			+ "| 매출이 0이 되었습니다.|\r\n"
    			+ "￣￣|/￣￣￣￣￣￣￣￣\r\n"
    			+ "  ∧,,∧\r\n"
    			+ "(   ° Д°)\r\n"
    			+ "O∪∪つ\n\n");
        System.out.println("-------------------------------------------------------");
        System.out.println("    현재 매출액 [ 0 ]원으로 [[게임패배]]하셨습니다.");
        System.out.println();
        System.out.println("         [1] 게임 결과보기");
        System.out.println("         [2] 게임 종료하기");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>>>>>>> 번호를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        choice(sc.nextInt());        
    }
    
    
    public void HpZero(){
    	System.out.println();
    	System.out.printf("_________________\r\n"
    			+ "| Hp가 0이 되었습니다.|\r\n"
    			+ "￣￣|/￣￣￣￣￣￣￣\r\n"
    			+ "  ∧,,∧\r\n"
    			+ "(   ° Д°)\r\n"
    			+ "O∪∪つ\n\n");
        System.out.println("-------------------------------------------------------");
        System.out.println("    플레이어 체력이 [ 0 ]점으로 [[게임패배]]하셨습니다.");
        System.out.println();
        System.out.println("         [1] 게임 결과보기");
        System.out.println("         [2] 게임 종료하기");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>>>>>>> 번호를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        choice(sc.nextInt());
    }
    
    public void SatisZero(){
    	System.out.println();
    	System.out.printf("______________________\r\n"
    			+ "| 고객만족도가 0이 되었습니다.|\r\n"
    			+ "￣￣￣|/￣￣￣￣￣￣￣￣￣\r\n"
    			+ "  ∧,,∧\r\n"
    			+ "(   ° Д°)\r\n"
    			+ "O∪∪つ\n\n");
        System.out.println("-------------------------------------------------------");
        System.out.println("    고객만족도 [ 0 ]점으로 [[게임패배]]하셨습니다.");
        System.out.println();
        System.out.println("         [1] 게임 결과보기");
        System.out.println("         [2] 게임 종료하기");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>>>>>>> 번호를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        choice(sc.nextInt());
    }
    
    
    public void gameExit() {
    	System.out.printf("  ˙˚ ʚ ᕱ⑅ᕱ ɞ˚˙\r\n"
    			+ "     (｡•◡•｡)\r\n"
    			+ "    ┏━O━O━┓\r\n"
    			+ "    The End\r\n"
    			+ "    ┗━ ━ ━┛\n\n");

        System.out.println("-------------------------------------------------------");
        System.out.println("    게임이 종료되었습니다. 이용해주셔서 감사합니다.");
        System.out.println("-------------------------------------------------------");
        System.exit(0);        //프로그램 종료
    }
    
    
    public void gameResult() {
        
        System.out.println("======================================================");
        System.out.printf("    현재 매장 청결도는 [ %s ]점 입니다.%n",ns.getNowClean());
        System.out.printf("    현재 고객 만족도는 [ %.1f ]점 입니다.%n",ns.getNowSatis());
        System.out.printf("    현재 플레이어의 체력은 [ %s ] 입니다.%n",ns.getNowHp());
        System.out.printf("    현재 매장 매출액은 [ %.2f ]만원 입니다.%n",ns.getNowMoney());
        System.out.println("         [1] 게임 종료하기");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>>>>>>> 번호를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        resultChoice(sc.nextInt());
        
        }
        
    public void gameClear() {
    	System.out.println("");
    	System.out.printf("⠀ 💗💗⠀ 💗💗\r\n"
    			+ "💗💖💖💗💖💖💗\r\n"
    			+ "💗💖💖💖💖💖💗\r\n"
    			+ "💗💖Success💖💗\r\n"
    			+ "⠀ 💗💖💖💖💗\r\n"
    			+ "⠀ ⠀ 💗💖💗\r\n"
    			+ "⠀ ⠀ ⠀ 💗\n\n");
    	
    	System.out.println("======================================================");
        System.out.printf("    현재 매장 청결도는 [ %s ]점 입니다.%n",ns.getNowClean());
        System.out.printf("    현재 고객 만족도는 [ %.1f ]점 입니다.%n",ns.getNowSatis());
        System.out.printf("    현재 플레이어의 체력은 [ %s ] 입니다.%n",ns.getNowHp());
        System.out.printf("    현재 매장 매출액은 [ %.2f ]만원 입니다.%n",ns.getNowMoney());
        System.out.println("         [1] 게임 종료하기");
        System.out.println("-------------------------------------------------------");
        System.out.print(">>>>>>>> 번호를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        resultChoice(sc.nextInt());
    }
    
    public void choice(int choice) {
        switch(choice) {
        case 1 : gameResult();
        case 2 : gameExit();
        default:System.out.println(">>>>>>>> 화면의 값 중에서 입력하세요");break;
        }
    }
    public void resultChoice(int choice) {
    	switch(choice) {
    	case 1:gameExit();break;
    	default:System.out.println(">>>>>>>> 화면의 값 중에서 입력하세요");break;
    	}
    }
    
    
    
    
}