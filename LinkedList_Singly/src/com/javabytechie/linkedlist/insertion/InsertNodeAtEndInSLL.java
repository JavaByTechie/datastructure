package com.javabytechie.linkedlist.insertion;

import com.javabytechie.linkedlist.Node;

//Java Program to Insert a Node at the End of Linked List
public class InsertNodeAtEndInSLL {

	// Method to insert a new node at the end of the linked list
	static Node insertAtEnd(Node head, int data) {

		// Create a new node
		Node node = new Node(data);

		// If the Linked List is empty, make the new
		// node as the head and return
		if (head == null) {
			return node;
		}

		// Store the head reference in a temporary variable
		Node last = head;

		// Traverse till the last node of the linked list
		while (last.next != null) {
			last = last.next;
		}

		// Change the next pointer of the last node to point to the new node
		last.next = node;

		// Return the head of the list
		return head;
	}

	// Method to print linked list
	static void printLinkedList(Node node) {
		while (node != null) {
			System.out.print(" " + node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		// Create a linked list:
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		System.out.print("Linked list values: ");
		printLinkedList(head);

		// Inserting a node at the end of the linked list
		head = insertAtEnd(head, 50);

		System.out.print("\nLinked List values, after inserting at the end: ");
		printLinkedList(head);
	}
}
