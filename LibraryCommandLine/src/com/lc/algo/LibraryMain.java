package com.lc.algo;

import java.util.ArrayList;
import java.util.List;

import com.lc.model.Item;

public class LibraryMain {

	public static void main(String[] args) {
		Library lib = new Library();
		
		
		System.out.println(lib.searchItem(101));
		System.out.println(lib.searchItem(102));
		System.out.println(lib.searchItem(103));
		
		System.out.println();
		
		System.out.println(lib.searchMember(2301));
		System.out.println(lib.searchMember(2302));
		System.out.println(lib.searchMember(2303));
		
		System.out.println();
		
		lib.issueItem(101, 2301);
		lib.issueItem(107, 2301);
		lib.issueItem(106, 2301);
		//lib.issueItem(108, 2301);
		
		lib.issueItem(102, 2302);
		lib.issueItem(103, 2303);
		lib.issueItem(104, 2304);
		//System.out.println(lib.searchItem(101));
	
		System.out.println(lib.searchMember(2302));
		System.out.println(lib.searchMember(2304));
		System.out.println(lib.searchMember(2301));
		
		System.out.println();
		
		lib.issueItem(121, 5104);
		lib.issueItem(122, 5101);
		lib.issueItem(123, 5102);
		
		System.out.println(lib.searchMember(5101));
		System.out.println(lib.searchMember(5102));
		System.out.println(lib.searchMember(5105));
		
		System.out.println();
		
		List<Item> issuedListItem = lib.getListOfIssuedItems();
		issuedListItem.forEach(System.out ::println);
		
	}

}
