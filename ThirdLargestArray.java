package com.xworkz.coding;

public class ThirdLargestArray {
	public static void main(String[] args) {
		
	int a[] = {59,20,12,6,7};
	for(int i=0; i<a.length; i++) {
	for(int j=i+1; j<a.length; j++) {
		
		
	if(a[i]<a[j]) {
	   
		   int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
	}
	}
	}
	System.out.println("Third Largest array:" + a[a.length-3]);
	
	}
}
	   
		
	


