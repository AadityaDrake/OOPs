package oop.mylibrary;

public class Loan {
	private Friend lender;
	private Item item;
	public Loan (Friend lender,Item item) {
		this.lender = lender;
		this.item = item;
	}
	public Friend getLender() {
		return lender;
	}
	public void setLender(Friend f) {
		lender = f;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item i) {
		item = i;
	}

	@Override
	public String toString(){
		return getLender()+"\t"+getItem();
	}
}
