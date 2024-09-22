package com.javabytechie.linkedlist.search;

// Java program to search a key in a linked list using Iterative approach

import com.javabytechie.linkedlist.Node;

public class SearchUsingIterativeApproachInSLL {

	// Method to checks whether key is present in the linked list
	static void searchKey(Node head, int key) {

		// Initialize tempNode with the head of linked list
		Node tempNode = head;

		// Iterate over all the nodes
		while (tempNode != null) {

			// Key is present, if tempNode's data is equal to the key.
			if (tempNode.data == key) {
				System.out.println(key + " is PRESENT in the list.");
				return; // returning because key is found.
			}

			// Move to the next node
			tempNode = tempNode.next;
		}

		// Key is not present, if there is no node with data as key
		System.out.println(key + " is NOT PRESENT in the list.");
	}

	public static void main(String[] args) {

		// Create a linked list
		Node head = new Node(50);
		head.next = new Node(30);
		head.next.next = new Node(10);
		head.next.next.next = new Node(70);
		head.next.next.next.next = new Node(40);

		// Linked list will be created like this
		// 50 -> 30 -> 10 -> 70 -> 40

		// 10 is the Key to search in the linked list
		searchKey(head, 10);

		// 100 is the Key to search in the linked list
		searchKey(head, 100);
	}
}
