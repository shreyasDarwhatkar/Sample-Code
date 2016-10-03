package Linkedlist;

public class Node {
		String Data;
		Node next;
		

		public   Node()
		{
			this.Data=null;
			this.next=null;
		}
		
		public Node(String objData)
		{
			this.Data=objData;
			this.next=null;
		}
		
		public Node(Node objnode,String ObjData)
		{
			this.next=objnode;
			this.Data=ObjData;
		}
		public String getData() {
			return Data;
		}
		public void setData(String data) {
			Data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
}
