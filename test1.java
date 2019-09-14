/*
Implement (from scratch, without using Java library components) a doubly linked list (of
integers) class which allows new integers to be added to either end of the list, any referenced
node to be removed, and the first and last integers to be read quickly.

*/


public class test1 {
	Node head;
	class Node {
		int data;
		Node prev;
		Node next;
		Node(int i){
			data=i;
		}
	}
	public void append(int i) { 
	    Node new_node = new Node(i);
	    new_node.next = null; 
	    Node end =head;
	    if (head==null) {
	    	new_node.prev=null;
	    	head=new_node;
	    	return;
	    }
	    while (end.next!=null) {
	    	end=end.next;
	    }
	    end.next=new_node;
	    new_node.prev=end;
	}
	public void replace(int i, Node position) {
		if (position == null) { 
	        System.out.println("The given position cannot be null "); 
	        return; 
	    } 
		position.data=i;
	}
	
	public int first() {
		return head.data;
	}
	public int last() {
		while (head.next!=null)
			head=head.next;
		return head.data;
	}
}
