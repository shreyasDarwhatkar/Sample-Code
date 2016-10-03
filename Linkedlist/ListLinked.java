package Linkedlist;

import java.util.LinkedList;
import java.util.Stack;

import cloudera.NodeInt;

public class ListLinked {
	Node head;
	int count;
	NodeInt HeadInt;
	
	public ListLinked(Node objNode ) {
		head=objNode;
		count=0;
	}
	
	public ListLinked(NodeInt objNode ) {
		HeadInt=objNode;
		count=0;
	}
		
	
	public void reverse()
	{
		//Node node=this.head;
		Node current=this.head;
		Node prev=null;
		Node nxt=null;
		while(current!=null)
		{
			nxt=current.getNext();
			current.setNext(prev);
			prev=current;
			current = nxt;
		}
		this.head = prev;	
	}
	public boolean checkPalidrome()
	{
		boolean PalidromeFlag=true;
		Node node=this.head;
		Node runner=this.head;
		Stack<String> stack=new Stack<String>();
		while(runner!=null && runner.getNext()!=null)
		{
			stack.push(node.getData());
			node=node.getNext();
			runner=runner.getNext().getNext();
		}
		
		if(runner!=null)
		{
			node=node.getNext();
		}
		while(node!=null)
		{
			String top=stack.pop();
			if(top.equalsIgnoreCase(node.getData()))
			{
				PalidromeFlag=true;
			}
			else {
				PalidromeFlag=false;
				break;
			}
			node=node.getNext();
		}

		return PalidromeFlag;
	}
	
	
	
	public int add(ListLinked objListLinked)
	{
		int sum=0;
		String firstint="";
		String Secondint="";
		int[] firstList=new int[this.count+1];
		int[] secondlist=new int[objListLinked.count+1];
		NodeInt objNodeInt1=this.HeadInt;
		NodeInt objNodeInt2=objListLinked.HeadInt;
		int i=0;
		while(objNodeInt1!=null || objNodeInt2!=null  )
		{
			if(objNodeInt1!=null)
			{
			firstList[i]=objNodeInt1.getData();
			objNodeInt1=objNodeInt1.getNext();
			}
			if(objNodeInt2!=null )
			{
				secondlist[i]=objNodeInt2.getData();
				objNodeInt2=objNodeInt2.getNext();
			}
			i++;
				
		}
		for(i=firstList.length-1;i>=0;i--)
		{
			firstint=firstint+firstList[i];
		}
		
		for(i=secondlist.length-1;i>=0;i--)
		{
			Secondint=Secondint+secondlist[i];
		}
		
		sum=Integer.parseInt(firstint)+Integer.parseInt(Secondint);
		return sum;
	}
	
	
	
	
	public  ListLinked addReverseListsIterative(ListLinked ln1, ListLinked ln2) {
		NodeInt n1=ln1.HeadInt;
		NodeInt n2=ln2.HeadInt;
		if (n1 == null)
			return ln2;
		if (n2 == null)
			return ln1;
		ListLinked result = null;
		int sum = 0;
		int carry = 0;
		while (n1 != null || n2 != null) {
			sum = carry;
			if (n1 != null) {
				sum += n1.getData();
				n1 = n1.getNext();
			}
			if (n2 != null) {
				sum += n2.getData();
				n2 = n2.getNext();
			}
			carry = sum / 10;
			if (result == null) {
				result = new ListLinked(new NodeInt(sum % 10));
			} else {
				result.appendToTail(sum % 10);
			}
		}
		if (carry == 1) {
			result.appendToTail(1);
		}
 
		return result;
	}
	
	public void appendToTail(int d) {
		NodeInt end = new NodeInt(d);
		NodeInt n = this.HeadInt;
		while (n.getNext() != null) {
			n = n.getNext();
		}
		n.setNext(end);
	}
	
	
	
	
	

	public void Linklistsort()
	{
		 NodeInt node=this.HeadInt;
	 while(node!=null)
	 {
		 if(node.getNext()!=null && node.getData()>node.getNext().getData())
		 {
			 int tempData=node.getData();
			 node.setData(node.getNext().getData());
			 node.getNext().setData(tempData);
			 node=this.HeadInt;
		 }
		 else
		 {
			 node=node.getNext();
		 }
	 }
	 
		
	}
	
	public void removeDuplicates()
	{
		Node previous = this.head;
		Node current =this.head.next;
		while(current != null){
			Node runner = this.head;
			while(runner != current){
				if(runner.getData()== current.getData()){
					current = current.getNext();
					previous.setNext(current);
					break;
				}
				runner = runner.next;
			}

			if(runner == current ){
				previous = previous.next;
				current = current.next;
			}
			
		}
	 
	}
	
	

	public void removeDuplicates2()
	{
		Node original=this.head;
		Node ref=this.head.next;
		Node runner=null;
		while(ref!=null)
		{
			runner=this.head;
			while(ref!=runner)
			{
				if(runner.getData()==ref.getData())
				{
					ref=ref.getNext();
					original.setNext(ref);
					break;
				}
				runner=runner.next;
				
			}
			
			if(ref==runner)
			{
				ref=ref.getNext();
				original=original.getNext();
				
			}
			
		}
		
	 
	}

	public void addNode(String data)
	{
		Node temp=new Node(data);
		Node current=head;
		while(current.getNext()!=null)
		{
			current=current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	public void remove(String Data)
	{
		Node node=this.head;
		Node temp=new Node();
		while(node!=null)
		{
			temp=node.getNext();
			if(temp!=null)
			{
			if(temp.getData()==Data)
			{
				node.setNext(temp.getNext());
				break;
			}
			
			}
			node=node.getNext();
		}
		
	}
	public void addatIndex(int index,String data)
	{
		Node newNode=new Node(data);
		Node temp=new Node();
		Node node=this.head;
		int i=1;
			while(node!=null)
			{
				if(i==index-1)
				{
					temp=node.next;
					newNode.setNext(temp);
					node.setNext(newNode);
				}
				node=node.getNext();
				i++;
			}
		
	}
	public void remove()
	{
		
		Node node=this.head;
		while(node!=null)
		{
			if(node.getNext().getNext()==null)
			{
				node.setNext(null);
			}
			node=node.getNext();
		}
		
	}
	
	
	void ReversePrint(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method.
		    
		    Node n=head;
		    if(n!=null)
		       ReversePrint(n.getNext());		    
		    if(n!=null)
		    System.out.println(n.getData());

		}

	void printReverse()
	{
		ReversePrint(this.head);
	}
	
	
	
	public void printNode()
	{
		Node node=this.head;
		while(node!=null)
		{ 
			System.out.println(node.getData());
			node=node.getNext();
		}
		
	}
	
	public void addNode(int data)
	{
		NodeInt temp=new NodeInt(data);
		NodeInt current=HeadInt;
		while(current.getNext()!=null)
		{
			current=current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	
	public void printintNode()
	{
		NodeInt node=this.HeadInt;
		while(node!=null)
		{ 
			System.out.println(node.getData());
			node=node.getNext();
		}
		
	}
	
	public void cloneList()
	{
		Node objNode=new Node(this.head.Data);
		ListLinked newList=new ListLinked(objNode);
		Node currentListPointer=this.head;
		while(currentListPointer!=null && currentListPointer.getNext()!=null)
		{
			currentListPointer=currentListPointer.getNext();
			//Node newNxtNode=new Node(currentListPointer.getData());
			newList.addNode(currentListPointer.getData());
		}
		System.out.println("First linked list is");
		this.printNode();
		
		System.out.println("Second Linked List is");
		newList.printNode();
		
	}
	
	public void cloneListEfficiently()
	{
		Node temp;
		Node objNode=new Node(this.head.getData());
		ListLinked newList=new ListLinked(objNode);
		Node prev=objNode;
		Node current=this.head.getNext();
		while(current!=null)
		{
			temp=new Node(current.getData());
			prev.setNext(temp);
			prev=temp;
			current=current.getNext();
		}
		prev.setNext(null);
		
		System.out.println("First linked list is");
		this.printNode();
		
		System.out.println("Second Linked List is");
		newList.printNode();
		
	}

}
