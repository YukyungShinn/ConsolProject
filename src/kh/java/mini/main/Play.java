package kh.java.mini.main;

import kh.java.mini.play.NowStatus;
import kh.java.mini.play.screen.Start;
import kh.java.mini.play.screen.Status;

public class Play {

	public static void main(String[] args) {
		NowStatus ns = new NowStatus();
		Status status = new Status(ns);
		Start start = new Start();
		start.start();
		ns.getNowStatusInfo();
		while(true) {
			status.choicePlay();
		}
	}

}
