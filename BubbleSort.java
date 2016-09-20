package com.code.practice;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] unsortedarr={5, 4, 3, 2, 1 };
		int[] unsortedarr2 = new int[] { 1, 2, 3, 4, 5 };  
		System.out.println("Unsorted Array : "+Arrays.toString(unsortedarr2));
		System.out.println("unoptimized");
		sort(unsortedarr2);
		System.out.println("\noptimized");
		sortEfficient(unsortedarr2);
		System.out.println("BubbleSorted :"+Arrays.toString(unsortedarr2));
	}
	
	public static void sort(int[] arr){
		
		int len=arr.length;
		for(int k=0;k<len-1;k++){
			System.out.println("sorting");
			for(int i=0;i<len-k-1;i++){
			
				if(arr[i] > arr[i+1]){
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				} 
		
			}
		}	
	}
	
	public static void sortEfficient(int[] arr){
		int len=arr.length;
		boolean swapped=true;
		
		for(int k=0;k<len-1 && swapped;k++){
			System.out.println("sorting");
			swapped=false;
			for(int i=0;i<len-k-1;i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					swapped=true;
				}
			}
		}
	}
	
}
