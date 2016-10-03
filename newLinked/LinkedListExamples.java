package newLinked;

public class LinkedListExamples {

	public static void main(String[] args) {
		Node node=new Node();
		node.value=1;

		Node node1=new Node();
		node1.value=2;

		Node node2=new Node();
		node2.value=3;

		Node node3=new Node();
		node3.value=4;

		Node node4=new Node();
		node4.value=5;
		
		Node node5=new Node();
		node5.value=6;

		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		LinkedListExamples obj=new LinkedListExamples();
		//obj.displaynode(node);
		//obj.insertnewnode(node5,node);
		//obj.reverseList(node);
		//ReverseLinkedList objReverseLinkedList = new ReverseLinkedList();
		
		//obj.displaynode(objReverseLinkedList.reverse(node));
		obj.displaynode(obj.oddEvenList(node));

	}
	public void displaynode(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.value);
			temp=temp.next;
		}
		
	}
	public void insertnewnode(Node node,Node head){
		Node temp=head;
		while(temp!=null){
			if(temp.next==null)
			{
			temp.next=node;
			break;
			}
			temp=temp.next;
		}
		System.out.println("New Linked List");
		displaynode(head);
	}
	public void reverseList(Node head){
		Node temp=head;
		Node nextnode=head.next;
				while(temp!=null){
					Node prev=temp;
					Node current=nextnode;
					temp=nextnode;
					if(temp.next!=null){
						if(temp.next.next!=null){
							nextnode=nextnode.next;
						}	
						else{
						nextnode=null;
						current.next=prev;
						break;
						}
					}
					current.next=prev;
				}
		head.next=null;
		head=temp;
		displaynode(head);			
	}
	
	
	public Node oddEvenList(Node head) {//1-2-3-4-5-6-7-8
	        if(head == null){
	            return head;
	        }
	        
	        Node oddPtr = head;
	        Node evenPtr = head;
	        int evenIndex = 0;
	        int oddIndex = 0;
	        int temp = 0 ;
	        //int tempPtr = null;
	        while(evenPtr !=null && oddPtr != null){
	            if(oddPtr.value % 2 == 0){
	                oddPtr = oddPtr.next;
	                oddIndex++;
	            }else if(evenPtr.value % 2 != 0){
	                evenPtr = evenPtr.next;
	                evenIndex++;
	            }
	            else{
	              oddPtr = oddPtr.next;
	              oddIndex++;
	            }
	            if(oddPtr != null && evenPtr != null){
	            if(oddPtr.value % 2 != 0 && evenPtr.value % 2 == 0 && oddIndex > evenIndex){
	                temp = oddPtr.value;
	                oddPtr.value = evenPtr.value;
	                evenPtr.value = temp;
	                evenPtr = evenPtr.next;
	                oddPtr = oddPtr.next;
	                oddIndex++;
	                evenIndex++;
	            }
	            }
	        }
	        return head;
	        
	    }

}
