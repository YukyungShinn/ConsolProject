package kh.java.mini.menu.juice;

public class Juice {
	
	private String juice;
	private float juiceM;
	boolean isRightAnswer = false;

	public Juice() {}
	
	public Juice(String juice, float juiceM) {
		super();
		this.juice = juice;
		this.juiceM = juiceM;
	}

	public String getJuice() {
		return juice;
	}

	public void setJuice(String juice) {
		this.juice = juice;
	}

	public float getJuiceM() {
		return juiceM;
	}

	public void setJuiceM(float juiceM) {
		this.juiceM = juiceM;
	}
	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
}
