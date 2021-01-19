package com.kh.test.fruit.model.vo;

// equals() 오버라이딩 매우 중요!!!

public class Fruit {
	public String name;
	public String flavor;
	
	public Fruit() {}
	public Fruit(String name, String flavor) {
		this.name = name;
		this.flavor = flavor;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public String toString() {
		return "Fruit [name=" + this.name + ", flavor=" + this.flavor + "]";
	}
	
	@Override
	public boolean equals(Object O) {
		boolean same = false;
		
		// 매개변수로 들어온 객체 O가 Fruit객체이고 null도 아니라면,
		// 그렇다면 O객체의 getName()과 getFlavor()를 호출해서 아얘 멤버변수와 내용을 직접 비교해서
		// 그 둘다 동일하다면 true를 반환해주도록 한다.
		if(O != null && O instanceof Fruit) {
			if(this.name == ((Fruit)O).getName() && this.flavor == ((Fruit)O).getFlavor()) {
				same = true;
			}
		}
		
		return same;
	}
	
}
