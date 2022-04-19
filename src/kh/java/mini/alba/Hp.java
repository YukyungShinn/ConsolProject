package kh.java.mini.alba;
//체력 클래스
public class Hp {
	private int making;
	private int cleaning;
	private int energyDrink;
	private int nowHP;
	
	public Hp() {}

	
	
	public Hp(int making, int cleaning, int energyDrink, int nowHP) {
		super();
		this.making = making;
		this.cleaning = cleaning;
		this.energyDrink = energyDrink;
		this.nowHP = nowHP;
	}

	public int getMaking() {
		return making;
	}
	public void setMaking(int making) {
		this.making = making;
	}
	public int getCleaning() {
		return cleaning;
	}
	public void setCleaning(int cleaning) {
		this.cleaning = cleaning;
	}
	public int getEnergyDrink() {
		return energyDrink;
	}
	public void setEnergyDrink(int energyDrink) {
		this.energyDrink = energyDrink;
	}
	public int getNowHP() {
		return nowHP;
	}
	public int setNowHP(int nowHP) {
		this.nowHP = nowHP;
		return nowHP;
	}
	@Override
	public String toString() {
		return "현재 체력은 "+nowHP+"입니다.";
	}
}
