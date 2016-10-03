package newLinked;

public class ReverseLinkedList {
	public Node reverse(Node node){//1
		Node temp = null;
		Node prev = node;//1 
		Node current = node.next;//2
		Node nodeNext = current.next;//3
		node.next = null;
		while(current != null){//5
			//System.out.println(prev.value+"->"+current.value+"->"+nodeNext.value);
			temp = current; //5
			current = nodeNext;//null
			temp.next = prev;//4
			prev = temp;//5
			if(current != null){
			nodeNext = current.next;//null
			}
		}
		return temp;
	}

}
