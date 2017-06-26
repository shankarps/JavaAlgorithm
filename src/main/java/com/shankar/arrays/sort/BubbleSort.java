package com.shankar.arrays.sort;

public class BubbleSort {
	
	public int[] sortAscending(int[] input){
		int[] sorted = new int[input.length];
		if(input.length == 1){
			return input;
		}
		//iterate through all the elements
		for(int i = 0; i< input.length; i++){
			//check if current element is greater than next and swap.
			for(int j = 0; j < input.length - 1 ; j++ ){
				if(input[j] > input[j+1]){
					int temp = input[j+1];
					input[j+1] = input[j];
					input[j] = temp;
				}
			}
			Util.printArray(input);
		}
		return sorted;
	}

}