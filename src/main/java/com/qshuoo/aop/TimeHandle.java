package com.qshuoo.aop;

public class TimeHandle {
	public void beginTime() {
		System.out.println("begin "+ System.currentTimeMillis());
	}
	
	public void endTime() {
		System.out.println("end " + System.currentTimeMillis());
	}

}
