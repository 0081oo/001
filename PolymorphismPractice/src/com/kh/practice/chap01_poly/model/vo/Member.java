package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
	public Member() {}
	
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getCouponCount() {
		return couponCount;
	}
	
	public void setCouponCount() {
		couponCount++;
	}

	public String toString() {
		return "Member [name = " + this.name + ", age = " + this.age
				+ ", gender = " + this.gender + ", couponCount = " + this.couponCount + "]";
	}
}
