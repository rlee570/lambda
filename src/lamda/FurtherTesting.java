package lamda;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class FurtherTesting {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		ArrayList<Integer> anotherIntArray = new ArrayList<Integer>();
		ArrayList<Integer> anotherIntArray2 = new ArrayList<Integer>();
		Random rand = new Random();

		for(int x =0; x < 10000000; x ++){			
			intArray.add(rand.nextInt(10000));
			anotherIntArray.add(rand.nextInt(10000));
			anotherIntArray2.add(rand.nextInt(10000));
		}

/*		Instant start = Instant.now();
		intArray.parallelStream().forEach(item -> {
			if(item <=5000){
				System.out.println(item);
			}
		});
		Instant end = Instant.now();
		System.out.println("ParallelStream finished in: "+ Duration.between(start, end));*/
		
		Instant start2 =Instant.now();
		for(Integer num:intArray){
			if(num <=5000){
				System.out.println(num);
			}
		}
		Instant end2 = Instant.now();
		System.out.println("Enhanced for loop finished in: "+ Duration.between(start2, end2));
		
/*		Instant start3 = Instant.now();
		intArray.stream().forEach(item -> {
			if(item <=5000){
				System.out.println(item);
			}
		});
		Instant end3 = Instant.now();
		System.out.println("Stream finished in: "+ Duration.between(start3, end3));*/
		
	}
}
