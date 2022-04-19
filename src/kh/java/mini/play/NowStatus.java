package kh.java.mini.play;

public class NowStatus {
	private int nowClean=80;
	private float nowSatis=50.0f;
	private int nowHp=80;
	private float nowMoney=0.00f;
	
	public NowStatus() {}

	public NowStatus(int nowClean, float nowSatis, int nowHp, float nowMoney) {
		super();
		this.nowClean = nowClean;
		this.nowSatis = nowSatis;
		this.nowHp = nowHp;
		this.nowMoney = nowMoney;
	}

	public int getNowClean() {
		return nowClean;
	}

	public void setNowClean(int nowClean) {
		this.nowClean = nowClean;
	}

	public float getNowSatis() {
		return nowSatis;
	}

	public void setNowSatis(float nowSatis) {
		this.nowSatis = nowSatis;
	}

	public int getNowHp() {
		return nowHp;
	}

	public void setNowHp(int nowHp) {
		this.nowHp = nowHp;
	}

	public float getNowMoney() {
		return nowMoney;
	}

	public void setNowMoney(float nowMoney) {
		this.nowMoney = nowMoney;
	}
	
	public void getNowStatusInfo() {
		System.out.println("======================================================\n"
				+ "              	    KH SANDWICH            	  \n"
				+ "======================================================");

		System.out.printf("	현재 매장 청결도는 [ %s ]점 입니다.%n",getNowClean());
		System.out.printf("	현재 고객 만족도는 [ %.1f ]점 입니다.%n",getNowSatis());
		System.out.printf("	현재 플레이어의 체력은 [ %s ] 입니다.%n",getNowHp());
		System.out.printf("	현재 매장 매출액은 [ %.2f ]만원 입니다.%n",getNowMoney());
		System.out.println("-------------------------------------------------------");
	}
}
