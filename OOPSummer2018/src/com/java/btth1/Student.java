package com.java.btth1;

public class Student {
	private String name = "";
	private String id = "";
	private String group = "";
	private String email = "";
	
	//Phuong thuc khoi tao khong tham so:
	public Student() {
		name = "Student";
		id = "000";
		group = "K61CC";
		email = "uet@gmail.com";
	}
	
	//Phuong thuc khoi tao co tham so:
	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		email = em;
		this.group = "K61CC";
	}
	
	//Phuong thuc khoi tao day du:
	public Student(String name, String id, String group, String email) {
		this.name = name;
		this.id = id;
		this.group = group;
		this.email = email;
	}
	//Phuong thuc khoi tao sao chep:
	//public Student(Student s, String name, String id, String group, String email) {
	public Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String 	getInfo() {
		return name +" "+ id +" "+ group +" "+ email;
	}
}
