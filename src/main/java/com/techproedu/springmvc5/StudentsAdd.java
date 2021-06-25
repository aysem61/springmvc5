package com.techproedu.springmvc5;

public class StudentsAdd {

	private String name;
	private int id;
	
	
	public StudentsAdd() {
		
	}


	public StudentsAdd(String name, int id) {
		
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "StudentsAdd [name=" + name + ", id=" + id + "]";
	}
		

	

}
