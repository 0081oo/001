package com.kh.exam7;

import java.awt.print.Book;
import java.util.*;

class Student{
	private String name;
	private char gender;
	private int classLevel;
	private int classNumber;
	private int classId;
	
	public Student(String name, char gender, int lvl, int num, int id) {
		this.name = name;
		this.gender = gender;
		this.classLevel = lvl;
		this.classNumber = num;
		this.classId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public String toString() {
		return this.name + Integer.toString(classNumber);
	}
	
	
}

class Grade {
	private String subject;
	private double score;
	
	public Grade(String subject, double score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
}

public class Sample7 {

	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student("hm", 'F', 1, 1, 25));
		stdList.add(new Student("aa", 'M', 1, 2, 28));
		
//		System.out.println(stdList);
		
		System.out.println(stdList.get(0).toString());
		System.out.println(stdList.get(1).toString());
		
		for(int i = 0; i < stdList.size(); i++) {
			System.out.println(stdList.get(i).toString());
		}

	}

}
