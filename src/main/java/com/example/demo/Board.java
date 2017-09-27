package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {

	@Id
	@GeneratedValue
	private Long id;
	private int temp;
	private String text;
	
	public Board() {
		
	}
	
	public Board(int temp, String text) {
		this.setTemp(temp);
		this.setText(text);
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
