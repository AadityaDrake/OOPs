package arraylist;

public class OrderedPair<K,V> {
	K key;
	V value;
	
	public OrderedPair(K key, V value){
		this.key=key;
		this.value=value;
	}
	
	public K getkey(){
		return key;
	}
	
	public V getvalue(){
		return value;
	}
	
	public static void main(String args[]){
		OrderedPair<Integer,String> a = new OrderedPair<Integer,String> (1,"ABC");
		System.out.print("Key :"+a.getkey()+"\nValue :"+a.getvalue());
		OrderedPair<String,Integer> b = new OrderedPair<String,Integer> ("ABC",1);
		System.out.print("\nKey :"+b.getkey()+"\nValue :"+b.getvalue());
	}
}
