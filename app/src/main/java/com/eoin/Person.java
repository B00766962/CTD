package com.eoin;

class Person{
	private String name;
	private String phone;
	private String gender;
	
	public Person(String n, String p, String g){
		name = n;
		phone = p;
		gender = g;
	}
	public String getName(){return name;}
	public String getPhone(){return phone;}
	public String getGender(){return gender;}
	
	public String toString(){
		return (name +" " + phone +" "+ gender);
	}
}