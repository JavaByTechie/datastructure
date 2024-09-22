package com.javabytechie.linkedlist.insertion;

import com.javabytechie.linkedlist.Node;

// Java Program to Insert a Node At a Specific Position in Linked List

public class InsertNodeAtSpecificPositionInSLL {
	// Method to insert a new node at the specific position in
	// the linked list
	static Node insertAtSpecPosition(Node head, int position, int data) {
		// Create a node
		Node node = new Node(data);

		// If the position is at the beginning means 1
		if (position == 1) {
			node.next = head;
			head = node;
			return head;
		}
		
		// If the position is other than 1
		Node current = head;
		for (int i = 1; i < position - 1 && current != null; ++i) {
			current = current.next;
		}

		// If the position is out of bounds
		if (current == null) {
			System.out.println("ERROR: Position is out of bounds.");
			return head;
		}

		node.next = current.next;
		current.next = node;
		return head;
	}

	// Print a linked list
	static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(" " + head.data);
			head = head.next;
		}
		System.out.println();        // New Line
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(40);
		head.next.next.next = new Node(50);

		System.out.print("Linked list before inserting a new node:\n");
		printLinkedList(head);

		// Insert a new node with data 30 at position 3
		int data = 30, position = 3;
		head = insertAtSpecPosition(head, position, data);
		System.out.print("\nLinked list after inserting 30 at the position " + position + ":\n");
		printLinkedList(head);
	}
}
