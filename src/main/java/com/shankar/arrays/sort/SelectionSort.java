package com.shankar.arrays.sort;

public class SelectionSort {
	
	public int[] sortAscending(int[] input){
		//Util.printArray(input);
		int[] output = new int[input.length];
		
		for(int i = 0; i < input.length; i++){
			//get the current position - assume it is smallest.
			int smallestPos = i;
			for(int j = i+1; j < input.length; j++){
				//get the smallest number and put in current position.
				if(input[j] < input[smallestPos])
					smallestPos = j;
			}
			//swap smallest to the current position.
			int temp = input[i];
			input[i] = input[smallestPos];
			input[smallestPos] = temp;
			Util.printArray(input);
		}
		
		return output;
	}

}
