package com.xyz.entity;

import java.sql.Timestamp;


public class Student {

	private Integer id;
	private String name;
	private String sex;
	private String tel;
	private String birth;
	private String home;
//	private byte[] picture; 
	
	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student( Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public Student(Integer id, String name, String sex, String tel, String birth,
			String home, byte[] picture) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.birth = birth;
		this.home = home;
//		this.picture = picture;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth2) {
		this.birth = birth2;
	}

	

	public String getHome() {
		return this.home;
	}

	public void setHome(String home) {
		this.home = home;
	}

//	public byte[] getPicture() {
//		return picture;
//	}
//
//	public void setPicture(byte[] picture) {
//		this.picture = picture;
//	}

	
}
