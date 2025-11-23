package cdac;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class ArrayOperations {
	public static void processArray(int arr[]) {
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("The Minimum element is: "+min);
		System.out.println("The Maximum Element is: "+max);
		//finding duplicates
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				
				
			}
		}
		
		temp[j++]=arr[arr.length-1];
		int uniqueueArray[]=Arrays.copyOf(temp, j);
		System.out.println("The unique Elements is: "+Arrays.toString(uniqueueArray));
	}
	

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		processArray(num);
		sc.close();
	}

}
