package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Home {

	private String owner;
	private String Doorno;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDoorno() {
		return Doorno;
	}

	public void setDoorno(String doorno) {
		Doorno = doorno;
	}

	public String connect() {
		System.out.println("Welcome connected");
		return Doorno;
	}

}
