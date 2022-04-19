package kh.java.mini.play;
 

import java.util.Random;
import java.util.Scanner;

import kh.java.mini.alba.Cleanliness;
import kh.java.mini.alba.Hp;
import kh.java.mini.alba.Sales;
import kh.java.mini.alba.Satisfaction;
import kh.java.mini.menu.juice.Ice;
import kh.java.mini.menu.juice.Juice;
import kh.java.mini.menu.juice.Sugar;
import kh.java.mini.menu.order.MakeOrder;
import kh.java.mini.menu.sandwich.Sandwich;
import kh.java.mini.menu.sandwich.SwBread;
import kh.java.mini.menu.sandwich.SwTopping;
import kh.java.mini.play.screen.Exit;
import kh.java.mini.play.screen.Status;

public class ReceiveOrder {

    /*
     * 랜덤주문을 실행하고, 입력받고, 맞는지 체크해서 청결도, 체력, 매출, 만족도를 변경하는 클래스
     */
    
    MakeOrder run = new MakeOrder();
    Sandwich sw=new Sandwich();
    SwBread swbread = new SwBread();
    SwTopping swtopping = new SwTopping();
    Juice orderJuice = new Juice();
    Sugar orderSugar = new Sugar();
    Ice orderIce = new Ice();
    Hp hp=new Hp();
    Satisfaction satis = new Satisfaction();
    Sales sales = new Sales();
    Cleanliness clean = new Cleanliness();
    Exit exit;
    Takeout takeout;

    Status status;
    NowStatus ns;
   

	public ReceiveOrder(Status status, NowStatus ns) {
		this.status = status;
		this.ns = ns;
		this.takeout = new Takeout(ns);
		this.exit=new Exit(status,ns);
	}

	public void rdReceive() {
    	Scanner sc=new Scanner(System.in);
    	
//        System.out.println(num);// 임시로 넣어둠
    	status.status(); 
    	Random rnd = new Random();
        int num = rnd.nextInt(3) + 1;
    	switch (num) {
        case 1:
        	{String playSandw=run.swOrder();
            System.out.println("[입력하세요]");
        		try {
            	System.out.print("샌드위치: ");
            	String InputSandwich=sc.next();
            	System.out.print("빵종류: ");
            	String InputSwBread=sc.next();
            	System.out.print("토핑: ");
            	String InputSwTopping=sc.next();
            	String[] arrSW=playSandw.split(" ");
            	for(int i=0;i<arrSW.length-1;i++) {
            		System.out.print("["+arrSW[i]+"] ");
            	}
            	
            	
            	
            	if(arrSW[0].equals(InputSandwich)==false||arrSW[1].equals(InputSwBread)==false||arrSW[2].equals(InputSwTopping)==false) 
            	{
            		System.out.println("> 틀렸습니다! ");
            		//만족도 -10*(200-청결도) 체력 -5
            		int hp=5;
            		failOrder(hp);
            	}
            	else {
            		System.out.println("> 주문 성공!");
            		//만족도 10*청결도, 체력 -5, money +
            		float moneySW=new Float(arrSW[3]);
            		satis.setNowSatis(moneySW);
            		System.out.printf("%.2f만원 획득!%n",moneySW);
            		int hp=5;
            		successOrder(hp,moneySW);
            	}
        		}catch(Exception e) {
        			System.out.println("");
        		}
            	break;
        	}
            
        case 2:
        {
            	String playJuice=run.jcOrder();
            	try {
            	System.out.println("[입력하세요]");
        		System.out.print("생과일주스: ");
        		String InputJuice=sc.next();
        		System.out.print("당도: ");
            	String InputSugar=sc.next();
            	System.out.print("얼음: ");
            	String InputIce=sc.next();
            	String[] arrJC=playJuice.split(" ");
            	for(int i=0;i<arrJC.length-1;i++) {
            		System.out.print("["+arrJC[i]+"] ");
            	}
            	System.out.println();
            	if(arrJC[0].equals(InputJuice)==false ||arrJC[1].equals(InputSugar)==false||arrJC[2].equals(InputIce) == false) 
            	{
            		
            		System.out.println("> 틀렸습니다! ");
            		//만족도 -10*(200-청결도), 체력 -3
            		int hp=3;
            		failOrder(hp);
            		
            	}
            	else {
            		System.out.println("> 주문 성공!");
            		//만족도 10*청결도 , 체력 -3
            		float moneyJC=new Float(arrJC[3]);
            		satis.setNowSatis(+moneyJC);
            		System.out.printf("%.2f만원 획득!%n",moneyJC);
            		int hp=3;
            		successOrder(hp,moneyJC);
            	}
            	}catch(Exception e) {
            		System.out.println("");
            	}
            	break;
        }
        case 3:
        {
        	try {
            String playSet=run.swjcOrder();
        	System.out.println("[입력하세요]");

            System.out.print("샌드위치: ");
        	String InputSandwich2=sc.next();
        	System.out.print("빵종류: ");
        	String InputSwBread2=sc.next();
        	System.out.print("토핑: ");
        	String InputSwTopping2=sc.next();
        	System.out.print("생과일주스: ");
    		String InputJuice2=sc.next();
    		System.out.print("당도: ");
        	String InputSugar2=sc.next();
        	System.out.print("얼음: ");
        	String InputIce2=sc.next();
        	
        	String[] arrSet=playSet.split(" ");
        	for(int i=0;i<arrSet.length-1;i++) {
        		System.out.print("["+arrSet[i]+"] ");
        	}
        	System.out.println();
        	if(arrSet[0].equals(InputSandwich2)==false||arrSet[1].equals(InputSwBread2)==false||arrSet[2].equals(InputSwTopping2)==false
        			||arrSet[3].equals(InputJuice2)==false||arrSet[4].equals(InputSugar2)==false||arrSet[5].equals(InputIce2) == false) 
        	{
        		System.out.println("> 틀렸습니다! ");
        		//만족도 -10*(200-청결도), 체력 -10
        		int hp=10;
        		failOrder(hp);
        	}
        	else {
        		
        		System.out.println("> 주문 성공!");
        		//만족도 10*청결도, 체력 -10, money+
        		float moneySWJC=new Float(arrSet[6]);
        		satis.setNowSatis(+moneySWJC);
        		System.out.printf("%.2f만원 획득!%n",moneySWJC);
        		int hp=10;
        		successOrder(hp,moneySWJC);
        	}
        	}catch(Exception e) {
        		System.out.println("");
        	}
        	break;
        }       
        }
	}
        
        

	
	

	private void successOrder(int hp2,float plusmoney) {
		// 주문 성공시 나오는 결과 작성
		ns.setNowSatis((float)(ns.getNowSatis()+10*ns.getNowClean()/100));
		float plusSatis=(float)(10*ns.getNowClean()/100);
		if(ns.getNowSatis()>=100 && ns.getNowHp()>5) {
			ns.setNowSatis(100);
			ns.setNowHp(ns.getNowHp()-hp2);
			ns.setNowMoney((float)(ns.getNowMoney()+plusmoney));
			System.out.println("------------------------주문결과-------------------------");
			System.out.printf("> 만족도 %.1f 증가, 체력 -%d 방전%n",plusSatis,hp2);
			Random rnd = new Random();
		    int num2 = rnd.nextInt(2)+1;
			switch(num2) {
			case 1: takeout.takeOut();break;
			case 2: takeout.takeIn();break;

			}
			if(ns.getNowMoney()>20.0f) {
				exit.gameClear();
			}
			else {
			status.status();
			ns.setNowClean(ns.getNowClean());
			ns.setNowHp(ns.getNowHp());
			ns.setNowMoney(ns.getNowMoney());
			ns.setNowSatis(ns.getNowSatis());
			}
		}  
		else if(ns.getNowSatis()<100 && ns.getNowHp()>5){
			ns.setNowHp(ns.getNowHp()-hp2);
			ns.setNowMoney((float)(ns.getNowMoney()+plusmoney));
			System.out.println("------------------------주문결과-------------------------");
			System.out.printf("> 만족도 %.1f 증가, 체력 -%d 방전%n",plusSatis,hp2);
			Random rnd = new Random();
		    int num2 = rnd.nextInt(2)+1;
			switch(num2) {
			case 1: takeout.takeOut();break;
			case 2: takeout.takeIn();break;
			}
			if(ns.getNowMoney()>20.0f) {
				exit.gameClear();
			}
			else {
			status.status();
			ns.setNowClean(ns.getNowClean());
			ns.setNowHp(ns.getNowHp());
			ns.setNowMoney(ns.getNowMoney());
			ns.setNowSatis(ns.getNowSatis());
			}
		}
		else if(ns.getNowSatis()>=100&&ns.getNowHp()<=5)
		{	
			ns.setNowMoney((float)(ns.getNowMoney()+plusmoney));
			ns.setNowSatis(100);
			ns.setNowHp(0);
			System.out.println("------------------------주문결과-------------------------");
			exit.HpZero();
			status.status();
			System.out.printf("> 만족도 %.1f 증가, 체력 -%d 방전%n",plusSatis,hp2);
			ns.setNowClean(ns.getNowClean());
			ns.setNowHp(ns.getNowHp());
			ns.setNowMoney(ns.getNowMoney());
			ns.setNowSatis(ns.getNowSatis());
			
		}
		else {
			ns.setNowMoney((float)(ns.getNowMoney()+plusmoney));
			ns.setNowHp(0);
			System.out.println("------------------------주문결과-------------------------");
			exit.HpZero();
			status.status();
			ns.setNowClean(ns.getNowClean());
			ns.setNowHp(ns.getNowHp());
			ns.setNowMoney(ns.getNowMoney());
			ns.setNowSatis(ns.getNowSatis());
			
			
		}
    }
	

	 public void failOrder(int hp) {
	    	ns.setNowSatis(ns.getNowSatis()-10*(200-ns.getNowClean())/100);
	    	if(ns.getNowSatis()<=0.0) {
	    		System.out.println("------------------------주문결과-------------------------");
	    		ns.setNowSatis(0.0f);
	    		exit.SatisZero();
	    		status.status();
	    		ns.setNowClean(ns.getNowClean());
				ns.setNowHp(ns.getNowHp());
				ns.setNowMoney(ns.getNowMoney());
				ns.setNowSatis(ns.getNowSatis());
	    	}
	    	else {
	    		ns.setNowHp(ns.getNowHp()-hp);
	    		if(ns.getNowHp()<0) {
	    			System.out.println("------------------------주문결과-------------------------");
	    			exit.HpZero();
	    			status.status();

	        		ns.setNowClean(ns.getNowClean());
	    			ns.setNowHp(ns.getNowHp());
	    			ns.setNowMoney(ns.getNowMoney());
	    			ns.setNowSatis(ns.getNowSatis());
	    		}
	    		else {
	    			status.status();
	        		System.out.printf("> 만족도 %.1f 감소, 체력 -%d 방전%n",10*(200-(float)ns.getNowClean())/100,hp);
	        		ns.setNowClean(ns.getNowClean());
	    			ns.setNowHp(ns.getNowHp());
	    			ns.setNowMoney(ns.getNowMoney());
	    			ns.setNowSatis(ns.getNowSatis());
	    		}
	    	}
	    }
	
	 
	

    

}
