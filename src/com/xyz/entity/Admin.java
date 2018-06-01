package com.xyz.entity;

public class Admin {
	private String id;
	private String name;
	private String pwd;

	public Admin() {
	}
	
	public Admin(String id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}


	public String getAdminId() {
		return this.id;
	}

	public void setAdminId(String adminId) {
		this.id = adminId;
	}

	public String getAdminName() {
		return this.name;
	}

	public void setAdminName(String adminName) {
		this.name = adminName;
	}
	public String getAdminPwd() {
		return this.pwd;
	}

	public void setAdminPwd(String adminUserPwd) {
		this.pwd = adminUserPwd;
	}
}
