package kh.java.mini.alba;
//만족도 클래스
public class Satisfaction extends Cleanliness{
	private float nowSatis;
	private float success;
	private float fail;
	
	public Satisfaction() {}

	public Satisfaction(float nowSatis, float success, float fail) {
		super();
		this.nowSatis = nowSatis;
		this.success = success;
		this.fail = fail;
	}

	public float getNowSatis() {
		return nowSatis;
	}

	public float setNowSatis(float arrSW) {
		this.nowSatis = arrSW;
		return arrSW;
	}

	public float getSuccess() {
		return success;
	}

	public void setSuccess(float success) {
		this.success = success;
	}

	public float getFail() {
		return fail;
	}

	public void setFail(float fail) {
		this.fail = fail;
	};
	@Override
	public String toString() {
		return "현재 만족도는 "+nowSatis+"입니다.";
	}
}
