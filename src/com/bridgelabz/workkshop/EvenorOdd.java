package com.bridgelabz.workkshop;

public class EvenorOdd {

	public static void main(String[] args) {
		
		int [] a = {22,56,44,23,76,89,65,78,11,34,565,78};
		System.out.print("Even Numbers : ");
		for(int i=0; i<a.length; i++) {
			int temp = a[i]%2;
			if(temp == 0) {
				int [] even = new int[a[i]];
				even[i] = a[i]; 
				System.out.print(even[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers : ");
		for(int j=0; j<a.length; j++) {
			int temp = a[j]%2;
			if(temp == 1) {
				int [] odd = new int[a[j]];
				odd[j] = a[j];
				System.out.print(odd[j]+" ");
			}
		}
	}
}
