package com.lc.model;

public class Faculty extends Member{
	int facId;
	String designation;
	
	public Faculty(int memberId, String memName, boolean isActive, int facId, String designation) {
		super(facId, designation, isActive);
		this.facId = facId;
		this.designation = designation;
	}

	public int getFacId() {
		return facId;
	}

	public void setFacId(int facId) {
		this.facId = facId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Faculty [facId=" + facId + ", designation=" + designation + ", getMemberId()= " + getMemberId() + ", getMemberName="
				+ getMemName() + ", isActive() =" + isActive() + ", maxBookIssued=" + maxBookIssued + ", countIssued="
				+ countIssued + "]";
	}
}
