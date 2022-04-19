package kh.java.mini.alba;
//매장 청결도 클래스
public class Cleanliness {
	
	protected int cleanliness;
	private int eatState;
	private int cleaning;
	
	public Cleanliness() {}
	public Cleanliness(int cleanliness,int eatState) {
		this.cleanliness=cleanliness;
		this.eatState=eatState;
	}
	public Cleanliness(int cleanliness, int eatState, int cleaning) {
		super();
		this.cleanliness = cleanliness;
		this.eatState = eatState;
		this.cleaning = cleaning;
	}

	public int getCleanliness() {
		return cleanliness;
	}

	public int setCleanliness(int cleanliness) {
		this.cleanliness = cleanliness;
		return cleanliness;
	}

	public int getEatState() {
		return eatState;
	}

	public void setEatState(int eatState) {
		this.eatState = eatState;
	}

	public int getCleaning() {
		return cleaning;
	}

	public void setCleaning(int cleaning) {
		this.cleaning = cleaning;
	};
	
	@Override
	public String toString() {
		return "현재 청결도는 "+cleanliness+"입니다.";
	}
}
