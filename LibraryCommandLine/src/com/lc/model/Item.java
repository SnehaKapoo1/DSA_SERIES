package com.lc.model;

abstract public class Item {
	
	private int itemId;
	   String itemType; 
	   Record record;
	   
	   public Item(int itemId, String itemType, Record record) {
			super();
			this.itemId = itemId;
			this.itemType = itemType;
			this.record = record;
		}
	
   
  @Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemType=" + itemType + ", record=" + record + "]";
	}

public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
}
