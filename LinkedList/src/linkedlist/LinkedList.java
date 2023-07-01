package linkedlist;

public class LinkedList {
	private Node head;
	public LinkedList() {
		head=null;
	}


	public void addAtEnd(int data) 
	{
		Node newnode=new Node();
		newnode.setData(data);
		newnode.setNext(null);
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node trav=head;
			while(trav.getNext()!=null) 
			{
			trav=trav.getNext();
		}
			trav.setNext(newnode);
		}
			
	}
	public void show() 
	{
		Node trav=head;
		while(trav!=null) 
		{
			System.out.println(trav.getData()+" ");
			trav=trav.getNext();
		}
	}
	public void addAtBegin(int data) 
	{
		Node newnode=new Node();
		newnode.setData(data);
		newnode.setNext(null);
		
		if(head==null)
		{
			head=newnode;
			Node trav=newnode;
			
			trav.setNext(newnode);
		}
		newnode.setNext(head);
		head=newnode;
			
		}

	public void addAtPosition(int data,int pos) 
	{
		
	}
	public void removeFromEnd() {
			Node lastnode= new Node();
			Node previousToLastNode=new Node();
			if(head==null) {
				 throw new RuntimeException("List already empty");			
			}
			else {
				lastnode=head;
				previousToLastNode=null;
				while(lastnode.getNext()!=null) {
					previousToLastNode=lastnode;
					lastnode=lastnode.getNext();
					
				}
				previousToLastNode.setNext(null);
				
				
				
				
			}
		}

		public void removFromBegin() {
			Node temp=new Node();
			if(head==null) {
				return;
			}else {
				temp=head;
				head=head.getNext();
				temp.setNext(null);
				
				
				
			}
		}
	public void removeFromPos(int pos)
	{
		
	}
}
