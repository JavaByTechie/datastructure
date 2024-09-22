package com.javabytechie.linkedlist.traversal;

import com.javabytechie.linkedlist.Node;

// Java program to traverse a linked list using Iterative approach

public class TraversalUsingIterativeApproachInSLL {
	// Method to traverse and print the list
	static void traverseList(Node head) {

		while (head != null) {
			// Printing data of node
			System.out.print(head.data + " -> ");
			// Moving to the next node
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// Create a linked list
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		// Linked list will be created like this
		// 10 -> 20 -> 30 -> 40 -> 50

		// Traversing and printing the list
		traverseList(head);
	}
}
