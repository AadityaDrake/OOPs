package oop.mylibrary;
import java.util.ArrayList;

public class MyLibrary {
	
	ArrayList<Friend> friend = new ArrayList<Friend>();
	ArrayList<Loan> loan = new ArrayList<Loan>();
	ArrayList<Item> item = new ArrayList<Item>();
	
	public MyLibrary() {
		
	}
	
	public void addFriend(Friend f) {
		friend.add(f);
	}
	
	public void addItem(Item testItem) {
		item.add(testItem);
	}
	
	public void addLoan(Loan l) {
		loan.add(l);
	}
	
	public ArrayList<Friend> getFriend() {
		return friend;
	}
	
	public ArrayList<Item> getItem() {
		return item;
	}
	
	public ArrayList<Loan> getLoan() {
		return loan;
	}
	
	public void removeLoan(Loan l)
	{
		loan.remove(l);
	}
	public void listFriends()
	{
		System.out.println(friend);
	}
	public void listItems()
	{
		System.out.println(item);
	}
	public void listLoans()
	{
		System.out.println(loan);
	}
	public void listLoans(Friend f)
	{
		System.out.println(f);
	}
	public void findLoans(Item i,Friend f)
	{
		
}
}
