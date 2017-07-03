package com.shankar.arrays.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

import edu.princeton.cs.algs4.StdRandom;

public class MergeSort {
	static int compare =0;
	static int loop =0;
	
	public static void merge(int[] input, int[] aux, int low, int mid, int hi){
		for(int k=low; k<= hi; k++){
			aux[k] = input[k];
		}
		
		int i=low;
		int j = mid + 1;
		System.out.println("Merge start - i ="+i+"  j = "+j);
		for(int k = low; k <= hi; k++){
			loop++;
			if(i > mid ){
				compare++;
			
				input[k] = aux[j++];
			}
			else if(j > hi){
				compare++;
				input[k] = aux[i++];
			}
			else if(aux[i] > aux[j]){
				compare++;
				input[k] = aux[j++];
			}
			else
				input[k] = aux[i++];
				
		}
		
	}
	
	
	public static void main(String args[]){
		
		int[] input = IntStream.range(0, 64).toArray();
		StdRandom.shuffle(input);
		int[] aux = new int[input.length];
		
		sort(input, aux, 0, input.length -1);
		System.out.println(Arrays.toString(input));
		System.out.println("compare "+compare);
		System.out.println(" loop  "+loop);
		
	}

	private static void sort(int[] input, int[] aux, int low, int high) {
		if(low >= high)
			return;
		int mid = low + ((high - low)/2);
		System.out.println(" mid "+mid+" low "+low+" high "+high);
		sort(input, aux, low, mid);
		sort(input, aux, mid+1, high);
		System.out.println("Merge  "+Arrays.toString(input));
		merge(input, aux, low, mid, high);
		
		
		
	}

}
