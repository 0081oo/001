package com.kh.exam5;

import java.io.*;

// 직렬화 serialization
// 역직렬화

/*
 *  직렬화 : 프로그램 안에서 사용하는 데이터를 다른 포맷 형식으로 변환하는 과정
 */

class Member implements Serializable{
	private String name;
	private char gender;
	private int age;
	
	public Member (String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("name : " + this.name + "\nage : " + this.age + "\ngender : "+this.gender);
	}
}

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("HM", 'F', 26);
		Member m2 = new Member("UU", 'M', 25);
		
		byte[] serialData = null;
		ByteArrayOutputStream baos  = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(m1);
			serialData = baos.toByteArray();
			System.out.println(new String(serialData));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 역직렬화
		ByteArrayInputStream bais = new ByteArrayInputStream(serialData);
		try {
			ObjectInputStream ois = new ObjectInputStream(bais);
			Object obj = ois.readObject();
			Member m3 = (Member)obj;
			m3.printInfo();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
