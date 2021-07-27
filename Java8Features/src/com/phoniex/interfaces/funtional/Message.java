package com.phoniex.interfaces.funtional;

public class Message {

	private String msg;

	public Message() {
	  System.out.println("default");
	}

	public Message(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
