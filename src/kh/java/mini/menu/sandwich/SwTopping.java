package kh.java.mini.menu.sandwich;

public class SwTopping {
	private String swTopping;
	private float swToppingM;
	boolean isRightAnswer = false;

	
	public SwTopping() {}

	public SwTopping(String swTopping, float swToppingM) {
		super();
		this.swTopping = swTopping;
		this.swToppingM = swToppingM;
	}

	public String getSwTopping() {
		return swTopping;
	}

	public void setSwTopping(String swTopping) {
		this.swTopping = swTopping;
	}

	public float getSwToppingM() {
		return swToppingM;
	}

	public void setSwToppingM(float swToppingM) {
		this.swToppingM = swToppingM;
	};
	
	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
	
	@Override
	public String toString() {
		return swTopping+":"+swToppingM;
	}
}
