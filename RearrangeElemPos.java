# Rearrange a linked list such that all even and odd positioned nodes are together
http://www.geeksforgeeks.org/rearrange-a-linked-list-such-that-all-even-and-odd-positioned-nodes-are-together/

Examples:

Input:   1->2->3->4
Output:  1->3->2->4

Input:   10->22->30->43->56->70
Output:  10->30->56->22->43->70

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
  
    
    
    public static Node RearrangePos(Node head){
        
    Odd=head;
    Even=head.next;
    EvenFirst=Even;
    
    while(true){
        
        if(Odd==null || Even==null || (Even.next==null)){
            Odd.next=EvenFirst;
            break;
        }
            
        Odd.next=Even.next;
        Odd=Even.next;
        
        if(Odd.next==null){
            Odd.next=EvenFirst;
            Even.next=null;
            break;
        }    
        
        Even.next=Odd.next;
        Even=Odd.next;
    
    }
    return head;
    
}
    
	public static void main (String[] args) {
	    
        LinkedList ll = new LinkedList();
        ll.head1= new Node(1);
        ll.head1.next=new Node(2);
        ll.head1.next.next=new Node(3);
        ll.head1.next.next.next=new Node(4);
        ll.head1.next.next.next.next=new Node(5);
        
       Node res = RearrangePos(head1);
      while(res!=null){
	System.out.print(res.data+" ");
	   res=res.next;
	}
	}
}


Output: Copy
1 3 5 2 4 

