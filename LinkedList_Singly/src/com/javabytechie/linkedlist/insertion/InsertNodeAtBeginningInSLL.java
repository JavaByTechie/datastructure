package com.javabytechie.linkedlist.insertion;

import com.javabytechie.linkedlist.Node;

// Java Program to insert a new node at the beginning of Linked List

public class InsertNodeAtBeginningInSLL {

	// method to insert a new node at the beginning of the linked list
	static Node insertAtFront(Node head, int data) {
		// Create a node with the given parameter data
		Node node = new Node(data);

		// Assigning next node reference from the head
		node.next = head;

		// Return the new node as the new head of the list
		return node;
	}

	// method to print linked list
	public static void printLinkedList(Node head) {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(" " + tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(); // Line break
	}

	public static void main(String[] args) {
		// create a head node
		Node head = new Node(40);
		head.next = new Node(60);
		head.next.next = new Node(80);
		head.next.next.next = new Node(100);

		// Print the current listed list data
		System.out.println("Linked List values: ");
		printLinkedList(head);

		// Insert a new node at the beginning of the linked list
		System.out.println("After inserting a Node at the beginning:");
		head = insertAtFront(head, 20);		// Inserting 20 at the beginning

		// Print the linked list after inserting a new node at the beginning
		printLinkedList(head);
	}
}
