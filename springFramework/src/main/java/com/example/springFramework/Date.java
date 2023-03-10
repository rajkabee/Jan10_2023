package com.example.springFramework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("date")
public class Date {
	int day;
	int month;
	int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDay() {
		return day;
	}
	@Value("32")
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	@Value("3")
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	@Value("2022")
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
