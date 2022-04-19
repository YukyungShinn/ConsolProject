package kh.java.mini.menu.juice;

public class Sugar {
	private String dangdo;
	boolean isRightAnswer = false;

	public Sugar() {}

	public Sugar(String dando) {
		super();
		this.dangdo = dando;
	}

	public String getDangdo() {
		return dangdo;
	}

	public void setDangdo(String dando) {
		this.dangdo = dando;
	}
	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
}
