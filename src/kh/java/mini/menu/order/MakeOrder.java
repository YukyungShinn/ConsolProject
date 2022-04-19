package kh.java.mini.menu.order;

import java.util.LinkedHashMap;
import java.util.Random;

import kh.java.mini.menu.juice.Ice;
import kh.java.mini.menu.juice.Juice;
import kh.java.mini.menu.juice.Sugar;
import kh.java.mini.menu.sandwich.Sandwich;
import kh.java.mini.menu.sandwich.SwBread;
import kh.java.mini.menu.sandwich.SwTopping;

public class MakeOrder {
	public LinkedHashMap<Integer,Sandwich>sandwich = new LinkedHashMap<>();
	public LinkedHashMap<Integer,SwBread>swBread = new LinkedHashMap<>();
	public LinkedHashMap<Integer,SwTopping>swTopping = new LinkedHashMap<>();
	public LinkedHashMap<Integer,Juice>juice = new LinkedHashMap<>();
	public LinkedHashMap<Integer,Sugar>sugar = new LinkedHashMap<>();
	public LinkedHashMap<Integer,Ice>ice = new LinkedHashMap<>();
	public MakeOrder() {
		// 필드 초기화
		sandInfo();
		juiceInfo();
//		System.out.println("MakeOrder 초기화 완료!");
//			System.out.println(ice);
	}


	public void sandInfo() {
		this.sandwich=new LinkedHashMap<>();
		this.swBread=new LinkedHashMap<>();
		this.swTopping=new LinkedHashMap<>();
		
		sandwich.put(1, new Sandwich("에그샐러드샌드위치",(float) 0.5));
		sandwich.put(2, new Sandwich("크림치즈연어샌드위치",(float) 1.0));
		sandwich.put(3, new Sandwich("닭가슴살샌드위치",(float) 0.8));
		sandwich.put(4, new Sandwich("터키베이컨샌드위치",(float) 0.8));
		
		swBread.put(1, new SwBread("식빵",(float) 0.0));
		swBread.put(2, new SwBread("바게트",(float) 0.1));
		swBread.put(3, new SwBread("치아바타",(float) 0.2));
		swBread.put(4, new SwBread("크로아상",(float) 0.2));
		
		swTopping.put(1, new SwTopping("루꼴라",(float) 0.1));
		swTopping.put(2, new SwTopping("베이컨",(float) 0.2));
		swTopping.put(3, new SwTopping("아메리칸치즈",(float) 0.1));
		swTopping.put(4, new SwTopping("해쉬브라운",(float) 0.2));
		swTopping.put(5, new SwTopping("없음",(float) 0.0));
		
	}
	
	public void juiceInfo() {
		this.juice=new LinkedHashMap<>();
		this.sugar=new LinkedHashMap<>();
		this.ice=new LinkedHashMap<>();
		
		juice.put(1, new Juice("바나나주스",(float) 0.25));
		juice.put(2, new Juice("키위주스",(float) 0.3));
		juice.put(3, new Juice("수박주스",(float) 0.3));
		juice.put(4, new Juice("딸기주스",(float) 0.35));
		
		sugar.put(1, new Sugar("100"));
		sugar.put(2, new Sugar("70"));
		sugar.put(3, new Sugar("50"));
		sugar.put(4, new Sugar("30"));
		sugar.put(5, new Sugar("0"));
		
		ice.put(1, new Ice("많이"));
		ice.put(2, new Ice("보통"));
		ice.put(3, new Ice("적게"));
	}
	

	
	public String swOrder() {
		Random rnd=new Random();
		int i=rnd.nextInt(4)+1;
		int j=rnd.nextInt(4)+1;
		int k=rnd.nextInt(5)+1;
		
		Sandwich sw=sandwich.get(i);
		SwBread swbread=swBread.get(j);
		SwTopping swtopping=swTopping.get(k);

//		System.out.println(sw);
//		System.out.println(swbread);
//		System.out.println(swtopping);
		
		System.out.println("손님의 주문은 [샌드위치] 이며");
		System.out.printf("샌드위치: %s%n",sw.getSandwich());
		System.out.printf("빵종류: %s%n",swbread.getSwBread());
		System.out.printf("토핑은: %s%n",swtopping.getSwTopping());
		float money=sw.getSandwichM()+swbread.getSwBreadM()+swtopping.getSwToppingM();
		System.out.printf("총 가격은 %.2f만원입니다.%n",money);
		System.out.println();
				
		return sw.getSandwich()+" "+swbread.getSwBread()+" "+swtopping.getSwTopping()+" "+money;
	}
	
	public String jcOrder() {
		Random rnd=new Random();
		int i=rnd.nextInt(4)+1;
		int j=rnd.nextInt(5)+1;
		int k=rnd.nextInt(3)+1;
		
		
		Juice orderJuice=juice.get(i);
		Sugar orderSugar=sugar.get(j);
		Ice orderIce=ice.get(k);
		
		System.out.println("손님의 주문은 [생과일주스] 이며");
		System.out.printf("생과일주스: %s%n",orderJuice.getJuice());
		System.out.printf("당도: %s%n",orderSugar.getDangdo());
		System.out.printf("얼음량: %s%n",orderIce.getAmount());
		float money=orderJuice.getJuiceM();
		System.out.printf("총 가격은 %.2f만원입니다.%n",money);
		System.out.println();
				
		return orderJuice.getJuice()+" "+orderSugar.getDangdo()+" "+orderIce.getAmount()+" "+money;
	}
	
	public String swjcOrder() {
		Random rnd=new Random();
		int a=rnd.nextInt(4)+1;
		int b=rnd.nextInt(4)+1;
		int c=rnd.nextInt(5)+1;
		int i=rnd.nextInt(4)+1;
		int j=rnd.nextInt(5)+1;
		int k=rnd.nextInt(3)+1;
		
		
		Sandwich sw=sandwich.get(a);
		SwBread swbread=swBread.get(b);
		SwTopping swtopping=swTopping.get(k);
		Juice orderJuice=juice.get(i);
		Sugar orderSugar=sugar.get(j);
		Ice orderIce=ice.get(k);

		System.out.printf("손님의 주문은 [샌드위치 & 주스 세트] 이며 %n");
		System.out.printf("샌드위치: %s%n",sw.getSandwich());
		System.out.printf("빵종류: %s%n",swbread.getSwBread());
		System.out.printf("토핑은: %s%n",swtopping.getSwTopping());
		System.out.printf("생과일주스: %s%n",orderJuice.getJuice());
		System.out.printf("당도: %s%n",orderSugar.getDangdo());
		System.out.printf("얼음량: %s%n",orderIce.getAmount());
		
		float money=(float)(orderJuice.getJuiceM()+sw.getSandwichM()+swbread.getSwBreadM()+swtopping.getSwToppingM()*0.8);
		
		System.out.printf("세트 할인이 적용된 가격은 %.2f만원입니다.%n",money);
		System.out.println();
				
		return sw.getSandwich()+" "+swbread.getSwBread()+" "+swtopping.getSwTopping()+" "+orderJuice.getJuice()+" "+orderSugar.getDangdo()+" "+orderIce.getAmount()+" "+money;
	}
}