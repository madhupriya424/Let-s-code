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
# Through HashMap:


import java.io.*;
import java.util.*;

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
  
    
    
   static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null)
        {
             // If we have already has this node
             // in hashmap it means their is a cycle
             // (Because you we encountering the
             // node second time).
            if (s.contains(h))
                return true;
  
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);
  
            h = h.next;
        }
  
        return false;
    }
    
	public static void main (String[] args) {
	    
        LinkedList ll = new LinkedList();
        ll.head1= new Node(1);
        ll.head1.next=new Node(2);
        ll.head1.next.next=new Node(3);
        ll.head1.next.next.next=new Node(4);
        
        ll.head1.next.next.next = ll.head1;
      
	System.out.print(detectLoop(head1));
	  
	}
	
}

O/P:
true
	
