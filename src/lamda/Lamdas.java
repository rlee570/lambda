package lamda;

import java.util.ArrayList;

public class Lamdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> anotherList = new ArrayList<String>();
		
		list.add("I ");
		list.add("am ");
		list.add("a ");
		list.add("string ");
		list.add("array.");
		
		anotherList.add("1");
		anotherList.add("2");
		anotherList.add("3");
		anotherList.add("4");
		anotherList.add("5. ");
		
		//Prints all values in the ArrayList 
		list.forEach(item -> System.out.print(item));
		
		//Prints only the value array. in the ArrayList
		list.forEach(item -> {
			if("array.".equals(item)){
				System.out.println();
				System.out.println(item);
			}
		});
		
		//Prints every word on a separate line
		list.forEach(System.out::println);
		
		//This uses another feature of Java 8 which is quite important streams
		//This example filters for the specified value which is array. in this example
		//Then outputs it
		list.stream()
			.filter(item -> item.contains("array."))
			.forEach(System.out::println);
		
		//This is a parallelStream it can run concurrently with no modification
		//It is very useful for introducing concurrency with no overhead.
		//It does not return in order by default.
		anotherList.parallelStream()
			.forEach(System.out::println);
		
		//This is what a nested for loop would look like.
		//It outputs the first ArrayList once and the
		//second Arraylist's contents 5 times.
		list.stream()
			.forEach(item -> {
				anotherList.forEach(System.out::print);
				System.out.println(item);
			});
	}
}
