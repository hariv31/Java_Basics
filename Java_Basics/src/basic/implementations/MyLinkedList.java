package basic.implementations;

import basic.implementations.pojo.Node;


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


class MyLinkedList {
	
	Node head = null;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	public int get(int index) {
		Node curr = head;
		int count = 0;
		int val = -1;
		while (curr != null) {
			if (count == index) {
				val = curr.getVal();
			}
		}
		return val;
	}
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	Node node = new Node();
    	node.setVal(val);
    	node.setNext(head);
    	this.setHead(node);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	Node node = new Node();
    	node.setVal(val);
    	Node curr = head;
    	 while (curr.getNext()!=null) {
    		 if(curr.getNext().getNext() == null) {
    			 curr.getNext().setNext(node);
    		 }
    	 }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	Node node = new Node();
    	node.setVal(val);
    	Node curr = head;
    	Node next = null;
    	int count =0;
    	while(curr.getNext() !=null) {
    		if(count == index) {
    			next = curr.getNext();
    			curr.setNext(node);
    			node.setNext(next);
    		}
    	}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    }

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
    
    
}