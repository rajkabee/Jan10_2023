package com.example.springFramework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dist")
public class Distributor {
	@Value("${distributor.id}")
	int id;
	//@Value("${distributor.name}")
	String name;
	@Value("${distributor.pan}")
	String pan;
	
	
	
	public Distributor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Distributor(int id, String name, String pan) {
		super();
		this.id = id;
		this.name = name;
		this.pan = pan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Distributor [id=" + id + ", name=" + name + ", pan=" + pan + "]";
	}
	
}
