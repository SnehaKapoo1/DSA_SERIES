package com.lc.model;

public class Student extends Member{

	int roll;
	String branch;
	
	public Student(int memberId, String memName, boolean isActive, int roll, String branch) {
		super(memberId, memName, isActive);
		this.roll = roll;
		this.branch = branch;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", branch=" + branch + ", getMemberId()=" + getMemberId() + ", getMemName()="
				+ getMemName() + ", isActive()=" + isActive() + ", getMaxBookIssued()=" + getMaxBookIssued()
				+ ", getCountIssued()=" + getCountIssued() + "]";
	}	
}
