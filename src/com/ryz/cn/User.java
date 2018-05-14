package com.ryz.cn;

import java.util.Date;

public class User {
	String name;
	int age;
	String sex;
	User auser;
	Date birthday;
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User getAuser() {
		return auser;
	}
	public void setAuser(User auser) {
		this.auser = auser;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", auser=" + auser + ", birthday=" + birthday
				+ "]";
	}
	
	
	

}
