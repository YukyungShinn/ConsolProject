package kh.java.mini.play;

public class Takeout {
	
	NowStatus ns;
	public Takeout(NowStatus ns) {
		this.ns=ns;
	}
	
	public void takeOut() {
		System.out.println("> 테이크 아웃 선택 (청결도 -0)");
		ns.setNowClean(ns.getNowClean());
	}
	public void takeIn() {
		System.out.println("> 매장 취식 선택 (청결도 -5)");
		ns.setNowClean(ns.getNowClean()-5);
	}
}
