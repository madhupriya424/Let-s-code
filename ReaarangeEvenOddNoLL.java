Input:   1->2->3->4
Output:  1->3->2->4	
	
Input:   10->22->30->43->56->70
Output:  10->30->56->70->22->43


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
    static Node curr=null;
    
    public static Node Rearrange(Node head){
    Node temp=head;
    int FC=0;
    while(temp!=null)
    {
       if(temp.data%2!=0){
        curr=temp.next;
        temp.next=Odd;
        Odd=temp;
        }    
    else{
        if(FC==0){
            EvenFirst=temp;
            FC++;
        }
        curr=temp.next;
        temp.next=Even;
        Even=temp;
       }
    temp=curr;
    }
    
    if(temp==null){
        EvenFirst.next=Odd;
    }
    return Even;
    }
    
    
	public static void main (String[] args) {
	    
        LinkedList ll = new LinkedList();
        ll.head1= new Node(1);
        ll.head1.next=new Node(2);
        ll.head1.next.next=new Node(3);
        ll.head1.next.next.next=new Node(4);
        ll.head1.next.next.next.next=new Node(5);
        
       Node res = Rearrange(head1);
      while(res!=null){
	System.out.print(res.data+" ");
	   res=res.next;
	}
	}
}

O/P:
4-> 2-> 5-> 3-> 1
