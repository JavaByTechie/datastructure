package com.javabytechie.linkedlist.reverse;

// Java program to reverse a linked list using Iterative approach

import com.javabytechie.linkedlist.Node;

public class ReverseUsingIterativeApproachInSLL {
	// Method to reverse a list
	static Node reverseList(Node head) {

		// Initialize three pointers: currNode, prevNode and nextNode
		Node currNode = head, prevNode = null, nextNode;

		// Traverse all the nodes of Linked List
		while (currNode != null) {

			// Store next
			nextNode = currNode.next;

			// Reverse currNodeent node's next pointer
			currNode.next = prevNode;

			// Move pointers one position ahead
			prevNode = currNode;
			currNode = nextNode;
		}

		// Return the head of reversed linked list
		return prevNode;
	}

	// Method to print a linked list
	static void printList(Node node) {
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
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

		System.out.print("Original Linked list:");
		printList(head);

		head = reverseList(head);

		System.out.print("\nReversed Linked List:");
		printList(head);
	}
}