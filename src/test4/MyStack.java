package test4;

import java.util.*;

public class MyStack {
	LinkedList linkedlist = new LinkedList();
	public void push(Object obj) {
		linkedlist.addFirst(obj);
	}
	public Object pop() {
		return linkedlist.removeFirst();
	}
	public Object peek() {
		return linkedlist.getFirst();
	}
	public boolean empty() {
		return linkedlist.isEmpty();
	}
	public String toString() {
		return linkedlist.toString();
	}
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("����");
		ms.push("����");
		ms.push("����");
		System.out.println(ms);
	}
}
