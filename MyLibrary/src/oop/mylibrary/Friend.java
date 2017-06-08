package oop.mylibrary;


public class Friend {
	String name;
	String address;
	String phone;
	String email;
	
	public Friend (String name,String addr,String phone,String email) {
		
		this.name = name;
		address = addr;
		this.phone = phone;
		this.email = email;
	}
	public void setName(String s){
		name = s;
	}
	public void setAddress(String s){
		address = s;
	}
	public void setPhone(String s){
		phone = s;
	}
	public void setEmail(String s){
		email = s;
	}
	public String getAddress(){
		return address;
	}
	public String getName(){
		return name;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}

	@Override
	public String toString(){
		return getName()+"\t"+getAddress()+"\t"+getPhone()+"\t"+getEmail();
	}
}
