package programs;

import java.util.Random;

public class LinkedListPgm {
	private node head = null;
	public static void main(String[] args){
		LinkedListPgm ll = new LinkedListPgm();
		ll.addItem();
		ll.display();
	}
	
	private void addItem(){
		Random rand = new Random();
		node last = null;
		for(int i=0;i < 10;i++){
			int num = rand.nextInt(50)+1;
			node newnode = new node(num);
			System.out.println(" before insert : "+ num);
			sortedInsert(newnode);
			display();
		}
	}
	
	private void display(){
		
		node curr = head;
		while(curr.next != null){
			System.out.print(curr.d +" -> ");
			curr = curr.next;
			
		}
	}
	
	private void sortedInsert(node nod){
		
		if(head == null || head.d > nod.d){
			nod.next = head;
			head = nod;
		}
//		else if(head.next == null){
//			
//			if(head.d > nod.d){
//				nod.next = head;
//				head = nod;
//			}
//			else
//				head.next = nod;
//		}
		else{
			node curr = head;
			while(curr.next != null && curr.d < nod.d)
				curr = curr.next;
			
			nod.next = curr.next;
			curr.next = nod;
		}
		
			
	}
	class node{
		int d;
		node next;
		node root;
		node(int val){
			this.d = val;
			next = null;
		}
		
		
	}
}


