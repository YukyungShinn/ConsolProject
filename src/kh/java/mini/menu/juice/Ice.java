package kh.java.mini.menu.juice;

public class Ice {

	private String amount;
	boolean isRightAnswer = false;

	public Ice() {}

	public Ice(String amount) {
		super();
		this.amount = amount;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
}
