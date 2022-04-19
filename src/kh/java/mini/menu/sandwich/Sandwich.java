package kh.java.mini.menu.sandwich;

public class Sandwich {
	private String sandwich;
	private float sandwichM;
	boolean isRightAnswer = false;
	
	public Sandwich() {}

	public Sandwich(String sandwich, float sandwichM) {
		super();
		this.sandwich = sandwich;
		this.sandwichM = sandwichM;
	}

	public String getSandwich() {
		return sandwich;
	}

	public void setSandwich(String sandwich) {
		this.sandwich = sandwich;
	}

	public float getSandwichM() {
		return sandwichM;
	}

	public void setSandwichM(float sandwichM) {
		this.sandwichM = sandwichM;
	};
	
	@Override
	public String toString() {
		return sandwich+":"+sandwichM;
	}
	
	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
}
