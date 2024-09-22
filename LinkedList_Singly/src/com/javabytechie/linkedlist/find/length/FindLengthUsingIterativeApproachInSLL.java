package com.javabytechie.linkedlist.find.length;

import com.javabytechie.linkedlist.Node;

// Java program to count the number of nodes in a linked list using Iterative approach

public class FindLengthUsingIterativeApproachInSLL {
	// Counts number of nodes in linked list
	static int countTotalNodes(Node head) {

		// Initialize count with 0
		int count = 0;

		// Initialize tempNode with head of Linked List
		Node tempNode = head;

		// Traverse till we reach null
		while (tempNode != null) {

			// Increment count by 1
			count++;

			// Move pointer to next node
			tempNode = tempNode.next;
		}
		// Return the count of nodes
		return count;
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

		// Printing total number of nodes in the list
		System.out.println("Length of the linked list is: " + countTotalNodes(head));

		// Now adding two more nodes
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = new Node(70);

		// Now, the linked list will be like this
		// 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70

		System.out.println("After adding two new nodes, length of the linked list is: " + countTotalNodes(head));
	}
}
