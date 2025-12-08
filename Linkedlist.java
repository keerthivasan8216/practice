package starprograms.example;

public class Linkedlist {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data= data;
			this.next= null;
		}
	}
	Node head;
	void insertatBeginning(int data) {
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	void insertatEnd(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	 void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "-");
			temp=temp.next;
		}
		System.out.println("null");
	}
	 void delete(int key) {
		 if(head.data==key) {
			 head=head.next;
		 }
		 Node temp=head;
		 while(temp.next!=null && temp.next.data!=key) {
			 temp=temp.next;
		 }
		 temp.next=temp.next.next;
	 }
	public static void main(String[] args) {
		Linkedlist li=new Linkedlist();
		li.insertatEnd(10);
		li.insertatEnd(20);
		li.insertatEnd(30);
		li.print();
		li.delete(20);
		li.print();
		li.insertatBeginning(100);
		li.print();
	}
}
