
# Reverse of a no.


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
   
    public static void push(int data){
        Node new_Node = new Node(data);
        new_Node.next = head1;
        head1=new_Node;
    }
   
    public static void Print(Node res){
         while(res!=null){
         System.out.print(res.data);
         if(res.next!=null){
             System.out.print("->");    // 5->4->3->2->1
         }
         res = res.next;
     }
    }
   
    public static Node Reverse(Node head){
     Node prev = null;
     Node curr = head;
     Node second = null;
     
     while(curr!=null){
         second = curr.next;
          curr.next=prev;
         prev = curr;
         curr = second;
     }
     return prev;
     
        
    }    
    
	public static void main (String[] args) {
	    
        LinkedList ll = new LinkedList();
   /*   ll.head1= new Node(1);
        ll.head1.next=new Node(2);
        ll.head1.next.next=new Node(3);
        ll.head1.next.next.next=new Node(4);  */
        
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);  // head 
        
    //  Reverse(head1); 
     Print(Reverse(head1));
	
	  
	}
	
}
