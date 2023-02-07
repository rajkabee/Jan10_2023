package com.example.J2SE.oop.abstraction;

public interface DAO {
	public void connect();
	public void disconnect();
	public abstract void write();
	public abstract void read();
}
