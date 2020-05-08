package com.elite.test03;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {

		String str="1.22,4.12,5.93,8.71,9.34,";
		double data[]= new double[5];
		double sum=0;
		double data3=0;
		
		StringTokenizer stn=new StringTokenizer(str,",");
		int countTokenens=stn.countTokens();
      
		for(int i=0; i<countTokenens; i++) {
			String data2=stn.nextToken();
//			System.out.println(data2);
			data3 = Double.parseDouble(data2);
			data[i] = data3;
		} 
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		System.out.println(sum);
	
		
	}

}
