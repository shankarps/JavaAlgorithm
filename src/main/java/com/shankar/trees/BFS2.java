package com.shankar.trees;

import java.util.LinkedList;


public class BFS2 {
	static class Node<T> {
		T value;
		Node<T> left;
		Node<T> right;

		Node(T value) {
			this.value = value;
		}

		void visit() {
			System.out.print(this.value + " ");
		}
	}

	public static void traverse(Node node){
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()){
			Node n = queue.remove();
			n.visit();
			if(n.left!=null)
				queue.add(n.left);
			if(n.right != null)
				queue.add(n.right);
		}
		
	}
	
	public static void main(String[] args) {
		 
		Node<Integer> one = new Node<Integer>(1);
		Node<Integer> two = new Node<Integer>(2);
		Node<Integer> three = new Node<Integer>(3);
		Node<Integer> four = new Node<Integer>(4);
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> six = new Node<Integer>(6);
		Node<Integer> seven = new Node<Integer>(7);
		Node<Integer> eight = new Node<Integer>(8);
		Node<Integer> nine = new Node<Integer>(9);
 
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		four.left = seven;
		six.left = eight;
		six.right = nine;
 
		System.out.println("Pre order"); 
		traverse(one);
}
}