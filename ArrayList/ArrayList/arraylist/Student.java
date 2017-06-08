package arraylist;

import java.util.*;

public class Student {
	
	public static void main(String args[]){
		
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in)	;
		System.out.print("Enter The No. Of Students :");
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++){
			System.out.print("Enter Name:");
			arr.add(sc.next());
		}
		sc.close();
	}	
}