package com.lc.model;

public class Magzine extends Item{

	int volume;
	String title;
	

	public Magzine(int itemId, String itemType, int volume, String title) {
		super(itemId, itemType, null);
		this.volume = volume;
		this.title = title;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Magzine [volume=" + volume + ", title=" + title + ", getItemId()=" + getItemId() + ", getItemType()="
				+ getItemType() + ", getRecord()=" + getRecord() + "]";
	}

	
	
	
}
