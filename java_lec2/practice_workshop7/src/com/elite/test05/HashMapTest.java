package com.elite.test05;
import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		double sum=0.0;
		double avg;
		
		for(int i=1; i<=10; i++) {
			map.put(i, (int)(Math.random()*100)+1);
		}

		Set<Integer> keys=map.keySet();
		for(Integer key : keys) {
			System.out.println(map.get(key));
			sum+=map.get(key);

		} 
			avg=sum/(double)map.size();
		System.out.printf("%.2f \n",sum);
		System.out.printf("%.2f",avg);
		
		

		
		
	}

}
