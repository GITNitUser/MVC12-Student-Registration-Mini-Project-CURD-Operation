package com.nt.bo;

import java.io.Serializable;

public class StudentBO implements Serializable {
	private int sno;
	private String sname;
	private String saddrs;
	private String course;
	private float fee;

	public StudentBO() {
		System.out.println("StudentBO-0-param-constructor");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddrs() {
		return saddrs;
	}

	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

}
