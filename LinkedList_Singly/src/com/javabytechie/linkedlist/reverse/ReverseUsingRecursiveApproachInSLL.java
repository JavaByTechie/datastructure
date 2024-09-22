package com.javabytechie.linkedlist.reverse;

// Java program to reverse a linked list using Recursive approach

import com.javabytechie.linkedlist.Node;

public class ReverseUsingRecursiveApproachInSLL {

	// Method to reverse a list
	static Node reverseList(Node head) {

		// If we reached the last node means list is empty,
		// simply return the head of list
		if (head == null || head.next == null)
			return head;

		// reverse the rest of linked list and put the first
		// element at the end
		Node rest = reverseList(head.next);

		// Make the current head as last node of remaining
		// linked list
		head.next.next = head;

		// Update next of current head to NULL
		head.next = null;

		// Return the reversed linked list
		return rest;
	}

	// Print a linked list
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
