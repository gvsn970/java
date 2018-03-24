package com.gusto.serviceinfosystem.bean;

public class ServiceInfoSystemBean {
	
	private String d_id,d_name,d_password,d_email;

	public ServiceInfoSystemBean(String d_id, String d_name, String d_password, String d_email) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_password = d_password;
		this.d_email = d_email;
	}

	public ServiceInfoSystemBean() {
	
		// TODO Auto-generated constructor stub
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_password() {
		return d_password;
	}

	public void setD_password(String d_password) {
		this.d_password = d_password;
	}

	public String getD_email() {
		return d_email;
	}

	public void setD_email(String d_email) {
		this.d_email = d_email;
	}
	
}
