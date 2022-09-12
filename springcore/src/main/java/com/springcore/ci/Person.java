package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list; 

	Person(String name, int personId, Certi certi, List<String> list) {
		this.name = name;
		this.personId = personId;
		this.certi= certi;
		this.list = list;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +"  :  "+ this.personId + "{ "+this.certi.name+" }" +"::::::::" + this.list;
	}
	

}
