package Linkedlist;

public class Stack {
	Node objnode;
	ListLinked objListLinked;

	public void Stack() {
		/*objnode = new Node();
		objListLinked = new ListLinked(objnode);*/
	}

	public void push(String value) {
		if (objListLinked != null) {
			Node node = new Node(value);
			node.setNext(objListLinked.head);
			this.objListLinked.head = node;
		}
		else
		{
			objnode = new Node(value);
			objListLinked = new ListLinked(objnode);
		}
	}

	public void pop() {
		System.out.println(objListLinked.head.getData());
		Node node = objListLinked.head;
		this.objListLinked.head = node.getNext();

	}

}
