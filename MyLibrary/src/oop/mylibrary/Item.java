package oop.mylibrary;

public class Item {
	
	private String Description;
	
	Item (String s) {
		Description = s;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String s) {
		Description = s;
	}
	

	@Override
	public String toString(){
		return getDescription();
	}
}
