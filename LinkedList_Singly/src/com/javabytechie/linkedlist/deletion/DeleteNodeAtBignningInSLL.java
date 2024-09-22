package com.javabytechie.linkedlist.deletion;

import com.javabytechie.linkedlist.Node;

// Java program to delete a node from the beginning of the linked list
public class DeleteNodeAtBignningInSLL {
	// Method to delete the head node
	static Node deleteHead(Node head) {
		// Before deleting a node just make sure list should not be empty
		if (head == null) {
			System.out.println("List is empty");
			return null;
		}

		// Change the head pointer to the next node
		// and free the original head
		Node temp = head;
		head = head.next;

		// Free the original head (handled by garbage collector)
		temp = null;

		// Return the new head
		return head;
	}

	// Method to print the doubly linked list
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

		// Deleting the head node
		head = deleteHead(head);
		System.out.println("After deleting head, Linked List data: ");
		printList(head);
	}
}
