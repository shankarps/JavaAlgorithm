package com.shankar.trees;

import java.util.Arrays;

public class CheckSum {

	public static void main(String[] args) {
		BinaryTree bt  = new BinaryTree(); 
		Arrays.stream(new int[]{8, 5, 4, 13, 9, 15, 1}).map( x -> {Node n= new Node(); n.value = x; bt.insert(n); return x;}).count();
		
		checkSum(bt, 37);
	}
	
	public static void checkSum(BinaryTree bt, int sum){
		boolean ans = isMatching(bt.getRoot(), sum);
		
		System.out.println(ans);
		
	}
	
	public static boolean isMatching(Node node, int sum){
		
		if(node == null){
			 if(sum == 0)
				 return true;
			 else
				 return false;
		}
		else{
			return (isMatching(node.left, (sum - node.value)) || isMatching(node.right, (sum - node.value)) );
		}
	}
}
