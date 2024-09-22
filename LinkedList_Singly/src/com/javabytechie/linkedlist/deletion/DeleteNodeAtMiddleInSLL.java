package com.javabytechie.linkedlist.deletion;

import com.javabytechie.linkedlist.Node;

// Java program to delete a node from the linked list at the given position
public class DeleteNodeAtMiddleInSLL {

	// Method to delete a node at a given position
	public static Node deleteNode(Node head, int position) {
		// Before deleting a node just make sure list should not be an empty
		if (head == null) {
			System.out.println("List is empty");
			return head;
		}

		Node temp = head;
		Node prev = null;

		// Case 1: Head is to be deleted
		if (position == 1) {
			head = temp.next;
			return head;
		}

		// Case 2: Node to be deleted is in middle
		// Traverse till given position
		for (int i = 1; temp != null && i < position; i++) {
			prev = temp;
			temp = temp.next;
		}

		// If given position is found, delete node
		if (temp != null) {
			prev.next = temp.next;
		} else {
			System.out.println("Data not present in the list.");
		}

		return head;
	}

	// Method to print a list
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
		head.next.next.next.next = new Node(50);

		System.out.println("Original Linked List data:");
		printList(head);

		// Deleting node at position 3
		head = deleteNode(head, 3);

		// Print list after deletion
		System.out.print("After deletion, Linked List data:\n");
		printList(head);
	}
}