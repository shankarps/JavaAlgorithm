package com.shankar.sort;

import java.util.stream.IntStream;

public class BinarySearch {
	
	public static void main(String ar[]){
		int[] array = IntStream.range(0, 100).toArray();
		
		for(int i=0; i < 100; i++){
			int position = search(array, i);
			System.out.println("pos "+i+"  is "+position);
		}
		
		/*int position = search(array, 9);
		System.out.println("pos 9 "+"  is "+position);*/
		
	}

	private static int search(int[] array, int searched) {
		int retVal = -1;
		int min =0;
		int max = array.length-1;
		
		
		
		while(min<= max){
			int mid = (max+min)/2;
			System.out.println("min "+min+" max "+max+" mid "+mid+" mid value ="+array[mid]);
			if(array[mid] > searched){
				max = mid-1;
				mid = (mid + min)/2;
			}else if(array[mid] < searched){
				min = mid+1;
				mid = (max + mid)/2; 
			}else if(array[mid] == searched){
				retVal = array[mid];
				break;
			}
		}
		
		return retVal;
	}

}
