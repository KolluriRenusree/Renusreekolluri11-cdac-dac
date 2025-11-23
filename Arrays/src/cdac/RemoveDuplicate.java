package cdac;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void duplicateRemover(int arr[]) {
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				
			}
		}
		temp[j++]=arr[arr.length-1];
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter array Elements: ");
		 Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			duplicateRemover(arr);
		

	}

}
