package Linkedlist;

import cloudera.NodeInt;

public class ImplementLinkedList {

	public static void main(String[] args) {
		
		 /*NodeInt IntNode=new NodeInt(7); 
		 ListLinked objLinkListInt=new ListLinked(IntNode);
		 objLinkListInt.addNode(1);
		 objLinkListInt.addNode(6);
		 objLinkListInt.printintNode();
		 objLinkListInt.Linklistsort();
		 System.out.println("After Sorting");
		 objLinkListInt.printintNode();
		 	*/
		/*Stack s1=new Stack();
		s1.push("a");
		s1.push("b");
		s1.push("c");
		s1.pop();
		s1.pop();
		s1.pop();
		queue q1=new queue();
		q1.push("a");
		q1.push("b");
		q1.pop();
		q1.pop();
		*/
	 Node node1=new Node("a"); 
	 ListLinked objLinkList=new ListLinked(node1);
	 objLinkList.addNode("b");
	 objLinkList.addNode("c");
	 objLinkList.addNode("d");
	 objLinkList.addNode("e");
	 objLinkList.addNode("f");
	 objLinkList.addNode("g");
	 objLinkList.addNode("h");
	 
	 objLinkList.printReverse();
	 //objLinkList.cloneList();
	 
	 //objLinkList.printNode();
	 //System.out.println("After Removing Duplicates");
	 //objLinkList.removeDuplicates();
	 //objLinkList.printNode();
	 //objLinkList.cloneListEfficiently();
	 /*
	 Node node1=new Node("a"); 
	 ListLinked objLinkList=new ListLinked(node1);
	 objLinkList.addNode("b");
	 objLinkList.addNode("c");
	 objLinkList.addNode("d");
	 
	 objLinkList.printNode();
	 
	// objLinkList.addatIndex(3, "newEntry");
	// objLinkList.remove("b");
	 objLinkList.removeDuplicates2();
	objLinkList.remove();
	 objLinkList.remove();
	 objLinkList.remove();
	 System.out.println("After Deleting nodes");
	objLinkList.printNode();
	 System.out.println("Numbers in linked List");
	 
	 
	 NodeInt IntNode=new NodeInt(7); 
	 ListLinked objLinkListInt=new ListLinked(IntNode);
	 objLinkListInt.addNode(1);
	 objLinkListInt.addNode(6);
	 objLinkListInt.printintNode();
	 //System.out.println("After Sort");
	 NodeInt IntNode1=new NodeInt(5); 
	 ListLinked objLinkListInt1=new ListLinked(IntNode1);
	 objLinkListInt1.addNode(9);
	 objLinkListInt1.addNode(2);
	 objLinkListInt1.printintNode();
	 System.out.println(objLinkListInt.add(objLinkListInt1));
	 /*
	 System.out.println("Sum in reverse list");
	// ListLinked objSumLinkListInt=objLinkListInt.addReverseListsIterative(objLinkListInt, objLinkListInt1);
	 objSumLinkListInt.printintNode();
	 //objLinkListInt.add(objLinkListInt1);
*/	 //objLinkListInt.printintNode();
	 //objLinkListInt1.printintNode();
		
		
		/*Node node1=new Node("i"); 
		 ListLinked objLinkList=new ListLinked(node1);
		 objLinkList.addNode("c");
		 objLinkList.addNode("i");
		 objLinkList.addNode("c");
		 objLinkList.addNode("i");
		 
		 System.out.println("First LinkList");
		 objLinkList.printNode();
		 
		 
		 if(objLinkList.checkPalidrome())
		 {
			 System.out.println("Linklist is palidrome");
		 }
		 else
		 {
			 System.out.println("Not palidrome");
		 }
*/		 

	}

}
