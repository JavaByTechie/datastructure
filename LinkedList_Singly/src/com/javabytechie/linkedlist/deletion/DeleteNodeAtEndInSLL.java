package com.javabytechie.linkedlist.deletion;

import com.javabytechie.linkedlist.Node;

// Java program to delete the end or last node of linked list
public class DeleteNodeAtEndInSLL {
	// Method to remove the last node from the linked list
	static Node removeLastNode(Node head) {

		// Before deleting a node just make sure list should not be empty
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}

		// If the list has only one node, delete it and return null
		if (head.next == null) {
			return null;
		}

		// Find the second last node
		Node secondLast = head;
		while (secondLast.next.next != null) {
			secondLast = secondLast.next;
		}

		// Delete the last node
		secondLast.next = null;

		return head;
	}

	// Method to print the list
	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// Create nodes
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		System.out.println("Original Linked List data: ");
		printList(head);

		// Removing the last node from the list
		head = removeLastNode(head);

		System.out.println("After removing last node, Linked List data: ");
		printList(head);
	}
}
