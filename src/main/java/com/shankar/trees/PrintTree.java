package com.shankar.trees;

import java.util.Arrays;

public class PrintTree {
	
	public static void main(String args[]){
		
		BinaryTree bt = new BinaryTree();
		Arrays.stream(new int[]{2, 10, 13, 4, 5, 15}).map(x -> {Node n = new Node(); n.value=x; bt.insert(n); return x;}).count();;
		
		printPostOrder(bt);
		
	}
	
	public static void printTree(BinaryTree bt){
		printNode(bt.getRoot());
	}
	
	private static void printNode(Node node){
		if(node == null)
			return;
		
		System.out.print(node.value + " ");
		printNode(node.left);
		printNode(node.right);
		
	}
	
	public static void printPostOrder(BinaryTree bt){
		printPostOrderNode(bt.getRoot());
	}
	
	private static void printPostOrderNode(Node node){
		if(node == null)
			return;
		
		
		printPostOrderNode(node.left);
		printPostOrderNode(node.right);
		System.out.print(node.value + " ");
		
	}

}
