package kh.java.mini.play;

import kh.java.mini.alba.Cleanliness;
import kh.java.mini.alba.Hp;
import kh.java.mini.alba.Sales;
import kh.java.mini.alba.Satisfaction;
import kh.java.mini.play.screen.Exit;
import kh.java.mini.play.screen.Status;

/**
 * 청소하는 동작을 플레이
 */
public class CleanStore {
	NowStatus ns;
	Status status;
	Cleanliness clean=new Cleanliness();
	Hp hp=new Hp();
	Sales sales=new Sales();
	Exit exit;
	Satisfaction satis=new Satisfaction();
	
	public CleanStore(Status status,NowStatus ns) {
		this.status=status;
		this.ns=ns;
	}
	
	public void cleanStore() {
		
		Runnable run1=new CleanThread("ʕ•̀▿•́=͟͟͞ʕ•̀▿•́ʔ[쓱 싹]",100);
		Thread th1=new Thread(run1);
		
	
		status.status();
		System.out.println("-------------------------------------------------------");
		System.out.println("                 청소를 시작합니다.");
		
		
		
		if(ns.getNowHp()<=10) {
			ns.setNowHp(0);
			System.out.println("------------------------청소결과-------------------------");
			System.out.println("> 체력 방전 ! ");
			exit.HpZero();
		}
		else {
			if(ns.getNowClean()>=90) {
				ns.setNowClean(100);
				ns.setNowHp(ns.getNowHp()-10);
				th1.start();
				System.out.println("------------------------청소결과-------------------------");
				status.status();			}
			else {
				ns.setNowClean(ns.getNowClean()+10);
				ns.setNowHp(ns.getNowHp()-10);
				th1.start();
				System.out.println("------------------------청소결과-------------------------");
				status.status();			}
			
		}
		
	}
	
	static class CleanThread implements Runnable{
		 
		private String a;
		private long millis;
		public CleanThread(String a,long millis) {
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