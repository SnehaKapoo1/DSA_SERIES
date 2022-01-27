package com.lc.model;

import java.sql.Date;

public class Record {
    
	Item item;
	int recordId;
    Member member;
    Date issueDate;
    Date retDate;
    int fine;
     
	public Record(Item item, int recordId, Member member, Date issueDate) {
		super();
		this.item = item;
		this.recordId = recordId;
		this.member = member;
		this.issueDate = issueDate;
	}

	
	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public int getRecordId() {
		return recordId;
	}


	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	public Date getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}


	public Date getRetDate() {
		return retDate;
	}


	public void setRetDate(Date retDate) {
		this.retDate = retDate;
	}


	public int getFine() {
		return fine;
	}


	public void setFine(int fine) {
		this.fine = fine;
	}
	
//	public int getBookIssued() {
//		return bookIssued;
//	}
//	
//	public void setBookIssued(int bookIssued) {
//		this.bookIssued = bookIssued;
//	}


	@Override
	public String toString() {
		return "Record [item=" + item.getItemId() + ", recordId=" + recordId + ", member=" + member.getMemName() + ", issueDate=" + issueDate
				+ ", retDate=" + retDate + ", fine=" + fine +  "]";
	}


	/*
	 * @Override public String toString() { return "Record [item=" +
	 * item.getItemId() + ", recordId=" + recordId + "," + " member=" +
	 * member.getMemName() + ", issueDate=" + issueDate + ", retDate=" + retDate +
	 * ", fine=" + fine + ", bookIssued=" + bookIssued" "]"; }
	 */


	
    
}
