package Linkedlist;

public class queue {

	ListLinked objListLinked;
	Node objNode;
	public queue() {
	
	}
	
	public void push(String value)
	{
		Node node=new Node(value);
		if(objListLinked!=null)
		{
			objNode=objListLinked.head;
			while(objNode.getNext()!=null)
			{
				objNode=objNode.getNext();
			}
			objNode.setNext(node);
			
		}
		else
		{
			objNode=new Node(value);
			objListLinked=new ListLinked(objNode);
		}
	}
	
	public void pop()
	{
		if(this.objListLinked!=null)
		{
		System.out.println(this.objListLinked.head.getData());
		this.objListLinked.head=this.objListLinked.head.getNext();
		}
	}
	
	

}
