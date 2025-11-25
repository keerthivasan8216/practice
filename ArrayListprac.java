package starprograms.example;
import java.util.*;
public class ArrayListprac {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
			arr.add(5);
			arr.add(6);
			arr.add(7);
			arr.add(2);
			arr.add(9);
			arr.add(1);
			arr.add(2);
			
		ArrayList arr2=(ArrayList)arr.clone();	
	System.out.println(arr2);
	System.out.println(arr.contains(2));
	System.out.println(arr.contains(arr2));
	System.out.println(arr.get(5));
	for(int num: arr) {
		System.out.print(num);
	}
	
	Iterator<Integer> it=arr.iterator();
	while(it.hasNext()) {
		int x=it.next();
		if(x==2) {
			it.remove();
		}
		else {
			System.out.print(x);
		}
	}
	 System.out.println( arr2.subList(1, 3) );
	}
}
