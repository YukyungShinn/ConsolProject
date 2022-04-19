package kh.java.mini.play;

import kh.java.mini.alba.Cleanliness;
import kh.java.mini.alba.Hp;
import kh.java.mini.alba.Sales;
import kh.java.mini.alba.Satisfaction;
import kh.java.mini.play.CleanStore.CleanThread;
import kh.java.mini.play.screen.Exit;
import kh.java.mini.play.screen.Status;

/**
 * 에너지드링크를 먹는 동작을 플레이
 */
public class EatDrink {
	NowStatus ns;
	Status status;
	Cleanliness clean=new Cleanliness();
	Hp hp=new Hp();
	Sales sales=new Sales();
	Exit exit;
	Satisfaction satis=new Satisfaction();
	
	public EatDrink(Status status,NowStatus ns) {
		this.status=status;
		this.ns=ns;
	}
	
	public void eatDrink() {
		
		Runnable run1=new CleanThread("꿀꺽",100);
		Thread th1=new Thread(run1);
		
		status.status();
		System.out.println("-------------------------------------------------------");
		System.out.println("                 체력을 보충합니다.");
		
		if(ns.getNowMoney()<=1.0) {
			System.out.println("-----------------------드링크 섭취 결과--------------------");
			System.out.println("> 드링크를 섭취할 돈이 없습니다. ");
			ns.setNowMoney(0);
			exit.moneyZero();
		}
		else {
			if(ns.getNowHp()>=80) {
				ns.setNowMoney((float)(ns.getNowMoney()-1.0));
				ns.setNowHp(100);
				th1.start();
				System.out.println("-----------------------드링크 섭취 결과--------------------");
				System.out.println("> 체력 완전히 충전 ! ");
				status.status();
				}
			else {
				ns.setNowMoney((float)(ns.getNowMoney()-1.0));
				ns.setNowHp(ns.getNowHp()+20);
				th1.start();
				System.out.println("-----------------------드링크 섭취 결과--------------------");
				System.out.println("> 체력 20 충전 ! ");
				status.status();	
			}
		}
	}
	
	static class EatThread implements Runnable{
		
		private String a;
		private long millis;
		public EatThread(String a,long millis) {
			this.a=a;
			this.millis=millis;
		}
		
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.print(a);
				
				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
}