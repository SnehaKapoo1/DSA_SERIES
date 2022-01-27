package com.lc.model;

abstract public class Member {

	int memberId;
	String memName;
	boolean isActive;
	int maxBookIssued = 3; 
	// for student 3 books are allowed
	//for faculty it can be 6
	//labtech 4
	int countIssued =0;

	public void incrementCountIssued() {

		countIssued++;
	}

	public void decrementCountIssued() {

		countIssued--;
	}


	public Member(int memberId, String memName, boolean isActive) {
		super();
		this.memberId = memberId;
		this.memName = memName;
		this.isActive = isActive;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public int getMaxBookIssued() {
		return maxBookIssued;
	}


	protected void setMaxBookIssued(int maxBookIssued) {
		this.maxBookIssued = maxBookIssued;
	}


	public int getCountIssued() {
		return countIssued;
	}


	public void setCountIssued(int countIssued) {
		this.countIssued = countIssued;
	}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memName=" + memName + ", isActive=" + isActive + "]";
	}


}
