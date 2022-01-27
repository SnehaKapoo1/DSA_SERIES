package com.lc.algo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.lc.model.Book;
import com.lc.model.Faculty;
import com.lc.model.Item;
import com.lc.model.Magzine;
import com.lc.model.Member;
import com.lc.model.Student;
import com.lc.model.Record;

public class Library {

	Map<Integer, Item> itemsMap = new HashMap<>();

	Map<Integer, Member> membersMap = new TreeMap<>();

	List<Record> recordList = new ArrayList<>();

	public Member searchMember(int memberId) {
		return membersMap.get(memberId);
	}

	public Item searchItem(int itemId) {
		return itemsMap.get(itemId);
	}

	public Library() {
		Book bk1 = new Book(101, "TextBook", 501,"Java Programming","Schildt");
		Book bk2 = new Book(102, "TextBook", 501,"Java Programming","Schildt");
		Book bk3 = new Book(103, "RefBook", 502,"Pointers in C","Kanitkar");
		Book bk4 = new Book(104, "RefBook", 502,"Pointers in C","Kanitkar");
		Book bk5 = new Book(105, "RefBook", 502,"Pointers in C","Kanitkar");
		Book bk6 = new Book(106, "TextBook", 503,"C Programming","Ritchie");
		Book bk7 = new Book(107, "TextBook", 503,"C Programming","Ritchie");
		Book bk8 = new Book(108, "RefBook", 504,"OOPS","Jacobson");
		Book bk9 = new Book(109, "RefBook", 504,"OOPS","Jacobson");
		Book bk10 = new Book(110, "TextBook", 505,"Let Us C","Kanitkar");
		Book bk11 = new Book(111, "TextBook", 505,"Let Us C","Kanitkar");

		itemsMap.put(101, bk1);
		itemsMap.put(102, bk2);
		itemsMap.put(103, bk3);
		itemsMap.put(104, bk4);
		itemsMap.put(105, bk5);
		itemsMap.put(106, bk6);
		itemsMap.put(107, bk7);
		itemsMap.put(108, bk8);
		itemsMap.put(109, bk9);
		itemsMap.put(110, bk10);
		itemsMap.put(111, bk11);

		Magzine m1 = new Magzine(121, "Monthly magzine", 152, "CSR");
		Magzine m2 = new Magzine(122, "Flimfare magzine", 153, "CSR");
		Magzine m3 = new Magzine(123, "Time magzine", 154, "CSR");
		Magzine m4 = new Magzine(124, "Business Today magzine", 155, "CSR");
		Magzine m5 = new Magzine(125, "Champak magzine", 156, "CSR");
		Magzine m6 = new Magzine(126, "India Today magzine", 157, "CSR");
		Magzine m7 = new Magzine(127, "GQ magzine", 158, "CSR");
		
		itemsMap.put(121, m1);
		itemsMap.put(122, m2);
		itemsMap.put(123, m3);
		itemsMap.put(124, m4);
		itemsMap.put(125, m5);
		itemsMap.put(126, m6);
		itemsMap.put(127, m7);
		
     	Student st1 = new Student(2301, "Devesh", true, 22021, "CSE");
		Student st2 = new Student(2302, "Venkat", true, 152036, "CSE");
		Student st3 = new Student(2303, "Gyan", true, 152048, "IT");
		Student st4 = new Student(2304, "Amandeep", true, 152049, "IT");
		Student st5 = new Student(2305, "Anuj", true, 152043, "IT");
		
		membersMap.put(2301, st1);
		membersMap.put(2302, st2);
		membersMap.put(2303, st3);
		membersMap.put(2304, st4);
		membersMap.put(2305, st5);
		
		Faculty facul1 = new Faculty(5101, "Adhoc Dinesh Kr", true, 51015102, "Java Trainner");
		Faculty facul2 = new Faculty(5102, "Prof Ashish Kr", true, 51015103, "Mathematics");
		Faculty facul3 = new Faculty(5103, "Adhoc Balvindar Kaur", true, 51015103, "Cloud computing");
		Faculty facul4 = new Faculty(5104, "Prof Deepak Singh", true, 51015104, "R programmer");
		Faculty facul5 = new Faculty(5105, "Prof Sneha Kapoor", true, 51015105, "Oops");

		membersMap.put(5101, facul1);
		membersMap.put(5102, facul2);
		membersMap.put(5103, facul3);
		membersMap.put(5104, facul4);
		membersMap.put(5105, facul5);
		
	
	}

	public boolean issueItem(int itemId, int memberId) {
		Item item = itemsMap.get(itemId);
		Member member = membersMap.get(memberId);
	    if(member.getCountIssued() >= member.getMaxBookIssued()) {
	    	String msg = "You are not allowed to issue more item";
	    	msg = msg + " max allowed " + member.getMaxBookIssued() + 
	    	" current issued " + member.getCountIssued();
	    	
	    	throw new RuntimeException(msg);
	    }
		
		Record rec = new Record(item, 1, member, Date.valueOf(LocalDate.now()));
		recordList.add(rec);
		item.setRecord(rec);
		member.incrementCountIssued();
		return true;
	}

	public boolean returnItem(int itemId) {
		Item item = itemsMap.get(itemId);
		Record record = item.getRecord();
		Member member = record.getMember();
		
		record.setRetDate(Date.valueOf(LocalDate.now()));
		int fine = calculateFine(record);
		record.setFine(fine);
		item.setRecord(null);
		member.decrementCountIssued();
		return true;
	}

	private int calculateFine(Record record) {
		Date isDate = record.getIssueDate();
		Date retDate = record.getIssueDate();

		Item item = record.getItem();

		return 0;
	}
	
	public List<Item> getListOfIssuedItems(){
		/*
		 * Collection<Item> allItems= itemsList.values(); allItems.removeIf(item ->
		 * item.getRecord() == null); List<Item> list = new ArrayList<>(allItems);
		 * return list;
		 */
		
		/*
		 * Collection<Item> values = itemsList.values(); 
		 * List<Item> list = new ArrayList<>();
		 * for(Item it : values) { if(it.getRecord() != null) {
		 * list.add(it); } }
		 * 
		 * return list;
		 */
		
//		// get all item Id
//		Set<Integer> keySet = itemsList.keySet(); // ctrl 2, press L
//		
//		// get the item for each id and check is it issued, if issued add to list
//		List<Item> list = new ArrayList<>();
//		for(int itemId : keySet) {
//		   Item item = itemsList.get(itemId);
//		   if(item.getRecord() != null) {
//			   list.add(item);
//		   }
//		}
		
		List<Item> list = new ArrayList<>();
		//for every record if retDte is null put that item in blank list
		
		for(int i=0; i<recordList.size(); i++) {
			Record rec = recordList.get(i);
			if(rec.getRetDate() == null) {
				list.add(rec.getItem());
			}
		}
		
		return list;
	}

    public List<Book> findBookWrittenBy(String authorName){
    	
    	List<Book> list = new ArrayList<>();
    	
		return list;
    	
    }

    public List<Item> getItemsIssued(int memId){
    	List<Item> list = new ArrayList<>();
    	Collection<Member> values = membersMap.values(); 
    	for(Member it : values) {
    		if(it.getMemberId() == memId) {
    			
    		}
    	}
    	
		return list;
    }
    
    List<Faculty> getFacultyByDesignation(String desi){
    	List<Faculty> list = new ArrayList<>();
    	Collection<Member> values = membersMap.values(); 
    	
    	for(Member mem : values) {
    		if(mem instanceof Faculty) {
    			Faculty fac = (Faculty) mem;
    			if(fac.getDesignation().equalsIgnoreCase(desi)) {
    				list.add(fac);
    			}
    		}
    	}
    	return list;

    }

}




























