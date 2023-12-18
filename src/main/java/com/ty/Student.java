package com.ty;

import java.util.List;

public class Student {

	private String name;
	private int age;
	private List<String> subjectname;
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
	public List<String> getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(List<String> subjectname) {
		this.subjectname = subjectname;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subjectname=" + subjectname + "]";
	}
	
	
}
