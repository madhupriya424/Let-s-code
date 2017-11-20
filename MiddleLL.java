


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
   
    public static Node Middle(Node head){
        
        Node slow=head;
        Node fast=head.next ;
   
        while(fast!=null && fast.next!=null ){
            
               fast=fast.next.next;
               slow=slow.next;
        }   
    return slow ;
}
    
	public static void main (String[] args) {
	    
        LinkedList ll = new LinkedList();
        ll.head1= new Node(1);
        ll.head1.next=new Node(2);
        ll.head1.next.next=new Node(3);
        ll.head1.next.next.next=new Node(4);
         ll.head1.next.next.next.next=new Node(5);
        
        //ll.head1.next.next.next = ll.head1;
     Node res = Middle(head1); 
	System.out.print(res.data);
	  
	}
	
}

O/P: 
3

Note:  
1 2 3 4 
O/P:
2
if we start fast=head and slow =head (From same place ) we get output 3;
