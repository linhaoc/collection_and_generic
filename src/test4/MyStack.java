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
		ms.push("张三");
		ms.push("李四");
		ms.push("王五");
		System.out.println(ms);
	}
}
