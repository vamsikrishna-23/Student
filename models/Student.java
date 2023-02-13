package com.svk.models;

public class Student {
	private long num,id,dob,anum; 
	private String name,city;
	private static long sanum = 1001;
	
	public Student(long anum, long num, long id, String name, String city, long dob) {
		
		this.name = name;
		this.city = city;
		this.num = num;
		this.anum = sanum;
		this.dob = dob;
		this.id=id;
		sanum++;
	}

	@Override
	public String toString() {
		return "Student [name= " + name + ",num=" + num + ", id=" + id + ", dob=" + dob + ", anum=" + anum + ", city="
				+ city + "]";
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getDob() {
		return dob;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}

	public long getAnum() {
		return anum;
	}

	public void setAnum(long anum) {
		this.anum = anum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
