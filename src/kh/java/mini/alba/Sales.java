package kh.java.mini.alba;
//매출 클래스
public class Sales {
	private float money;
	
	public Sales() {}

	public Sales(float money) {
		super();
		this.money = money;
	}

	public float getMoney() {
		return money;
	}

	public float setMoney(float money) {
		this.money = money;
		return money;
	}
	@Override
	public String toString() {
		return "현재 매출은 "+money+"원 입니다.";
	}
}
