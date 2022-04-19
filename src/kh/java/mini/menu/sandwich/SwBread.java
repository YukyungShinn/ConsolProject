package kh.java.mini.menu.sandwich;

public class SwBread {
	private String swBread;
	private float swBreadM;
	boolean isRightAnswer=false;
	public SwBread() {}

	public SwBread(String swBread, float d) {
		super();
		this.swBread = swBread;
		this.swBreadM = d;
	}

	public String getSwBread() {
		return swBread;
	}

	public void setSwBread(String swBread) {
		this.swBread = swBread;
	}

	public float getSwBreadM() {
		return swBreadM;
	}

	public void setSwBreadM(float swBreadM) {
		this.swBreadM = swBreadM;
	};
	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
	@Override
	public String toString() {
		return swBread+":"+swBreadM;
	}
}
