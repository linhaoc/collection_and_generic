package test4;

import java.util.LinkedList;

public class MyQuene {
	LinkedList lists = new LinkedList();
	public void push(Object obj) {
		lists.addLast(obj);
	}
	public Object pop() {
		return lists.removeFirst();
	}
	public String toString() {
		return lists.toString();
	}
	public static void main(String[] args) {
		MyQuene mq = new MyQuene();
		mq.push("ºìÉ«");
		mq.push("³ÈÉ«");
		mq.push("À¶É«");
		System.out.println(mq);
		System.out.println(mq.pop());
		System.out.println(mq);
		
	}
}
