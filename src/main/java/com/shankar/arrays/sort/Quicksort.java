package com.shankar.arrays.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

import edu.princeton.cs.algs4.StdRandom;

public class Quicksort {
	
	public static void main(String ar[]){
		int[] array = IntStream.range(0, 100).toArray();
		StdRandom.shuffle(array);
		System.out.println(Arrays.toString(array));
		sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	private static void sort(int[] array, int lo, int hi){
		if(lo >= hi){
			return;
		}
		//partition first
		int part = partition(array, lo, hi);
		
		//sort the first half partition
		sort(array, lo, part-1);
		//sort the second half partition
		sort(array, part+1, hi);
		
		
	}
	
	private static int partition(int[] array, int lo, int hi) {
		//lo is the partition element (this is why we need to shuffle)
		int part = lo;
		//left to right
		int left = lo;
		//right to left
		int right = hi+1;
		
		while(true){
			//System.out.println("----   "+" left "+left+" right "+right);
			//keep moving the left indicator to right till we see element greater than partition
			//this means it has to be swapped
			while(array[++left] < array[part]){
				//System.out.println("first   "+" left "+left+" right "+right);
				if(left == hi){
					break;
				}
			}
			
			//keep moving the right indicator to left till we see an element less than partition
			//this means it has to be swapped
			while(array[--right] > array[part]){
				//System.out.println("second   "+" left "+left+" right "+right);
				if(right == lo){
					break;
				}
			}
			
			if(left >= right){
				break;
			}
			//here we will have a valid left greater than part,
			//and a valid right less than part.
			//exchange left and right
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			//System.out.println("**   "+" left "+left+" right "+right);
			//System.out.println("**   "+Arrays.toString(array));
		}
		
		//exchange lo and right
		int temp = array[part];
		array[part] = array[right];
		array[right] = temp;
		//System.out.println("##   "+" left "+left+" right "+right);
		return right;
	}

}
