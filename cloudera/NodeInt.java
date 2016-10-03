package cloudera;

import Linkedlist.Node;

public class NodeInt {
	int Data;
	NodeInt next;
	public NodeInt(int data) {
		super();
		Data = data;
		next=null;
	}
	public int getData() {
		return Data;
	}
	public void setData(int data) {
		Data = data;
	}
	public NodeInt getNext() {
		return next;
	}
	public void setNext(NodeInt next) {
		this.next = next;
	}
	
}
