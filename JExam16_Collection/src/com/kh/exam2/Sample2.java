package com.kh.exam2;

class Student{
	private String name;
	private char gender;
	private int age;
	private int grade;
	private int clNum;
	private int stNum;
	
	public Student(String name, char gender, int age, int grade, int clNum, int stNum) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
		this.clNum = clNum;
		this.stNum = stNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClNum() {
		return clNum;
	}
	public void setClNum(int clNum) {
		this.clNum = clNum;
	}
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	
	
}

class genStudent<T>{
	private String name;
	private char gender;
	private int age;
	private T grade;
	private T clNum;
	private int stNum;
	
	public genStudent(String name, char gender, int age, T grade, T clNum, int stNum) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
		this.clNum = clNum;
		this.stNum = stNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public T getGrade() {
		return grade;
	}
	public void setGrade(T grade) {
		this.grade = grade;
	}
	public T getClNum() {
		return clNum;
	}
	public void setClNum(T clNum) {
		this.clNum = clNum;
	}
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	
	
}

class Grade<T>{
	private String subject;
	private T grade;
	
	public Grade(String subject, T grade) {
		this.subject = subject;
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public T getGrade() {
		return grade;
	}

	public void setGrade(T grade) {
		this.grade = grade;
	}
	
	
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("A", 'F', 12, 6, 3, 15);
		Student s2 = new Student("B", 'M', 12, 6, 4, 3);
		
		System.out.println(s1.getGrade()+"학년 "+s1.getName());
		System.out.println(s2.getGrade()+"학년 "+s2.getName());
		
		genStudent<String> s3 = new genStudent<>("A", 'F', 12, "기린", "D", 15);
		genStudent<String> s4 = new genStudent<>("B", 'M', 12, "코끼리", "C", 3);
		
		Grade<String> hm = new Grade<>("Korean", "A+");
		Grade<Integer> hm2 = new Grade<>("English", 95);
		
		System.out.println(hm.getSubject() + " 과목 점수 : " + hm.getGrade());
		System.out.println(hm2.getSubject() + " 과목 점수 : " + hm2.getGrade());
	}

}
