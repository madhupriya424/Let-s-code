# Detect loop in a Linked List


import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        next=null;
    }
}



class LinkedList {
    static Node head1;
    static Node Even=null;
    static Node Odd=null;
    static Node EvenFirst=null;
  
    
    
    public static Boolean Cycle(Node head){
        
        Node slow=head;
        Node fast=head.next;
   
        while(fast!=null && slow!=null && fast.next!=null ){
            if(fast==slow)
               return true;
               fast=fast.next.next;
               slow=slow.next;
        }   
    return false;
}
    
	public static void main (String[] args) {
	    
        LinkedList ll = new LinkedList();
        ll.head1= new Node(1);
        ll.head1.next=new Node(2);
        ll.head1.next.next=new Node(3);
        ll.head1.next.next.next=new Node(4);
        
        //ll.head1.next.next.next = ll.head1; //O/P: True
      
	System.out.print(Cycle(head1));
	  
	}
	
}

O/p:
false
