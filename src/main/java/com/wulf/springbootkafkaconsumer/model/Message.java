package com.wulf.springbootkafkaconsumer.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class Message {
	
	private int id;
	
	private String userName;
	
	private String message;
	
	public Message() {
		
	}

	public Message(int id, String userName, String message) {
		super();
		this.id = id;
		this.userName = userName;
		this.message = message;
	}
	
	

}
