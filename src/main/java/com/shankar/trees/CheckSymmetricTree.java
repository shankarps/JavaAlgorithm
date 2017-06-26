package com.shankar.trees;

public class CheckSymmetricTree {

	public static void main(String[] args) {
		
		Node root = new Node();
		root.value = 1;
		
		Node firstLevel = new Node();
		firstLevel.value =2;
		root.left = firstLevel;
		root.right = firstLevel;
		
		Node secondLevel = new Node();
		secondLevel.value =3;
		firstLevel.left = secondLevel;
		firstLevel.right = secondLevel;
		
		Node thirdLevel = new Node();
		thirdLevel.value = 4;
		firstLevel.right = thirdLevel;

		System.out.println(checkSymmetry(root));
	}

	private static boolean checkSymmetry(Node node) {
		return isSymmetric(node);
		
	}

	private static boolean isSymmetric(Node node) {
		if(node == null){
			return true;
		}
		if(node.left == null && node.right != null){
			return false;
		}
		if(node.left != null && node.right == null){
			return false;
		}
		if(node.left == null && node.right == null){
			return true;
		}
		if(node.left.value != node.right.value){
			return false;
		}
		else{
			return (isSymmetric(node.left) && isSymmetric(node.right));
		}
	}
	
	

}
