class singlyLinkedList{
	public Node head = null;
	public Node tail = null;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}		
	}
	
	public void addNode(int data){
		Node newNode = new Node(data);
		
		if(head==null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void addBegining(int data){
		Node newNode = new Node(data);
		
		if(head==null){
			head = newNode;
			tail = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
	}
	public void addPosition(int position,int value){
		Node newNode = new Node(value);
		Node current = head;
		
		if(head==null){
			head = newNode;
			tail = newNode;
		}else if(current == tail){
			tail.next = newNode;
			tail = newNode;
		}
		else{
			for(int i=0; i<position-2;i++){
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	public void addEnd(int data){
		Node newNode = new Node(data);
		Node current = head;
		if(head==null){
			System.out.println("List is empty");
			head = newNode;
			tail = newNode;
		}
		else{
			int i =0;
			while(current.next!=null){
				current = current.next;
			}
			newNode.next = null;
			current.next = newNode;
		}
	}
	
	public void deleteBegining(){
		Node current = head;
		if(head==null){
			System.out.println();
		}
		else{
			head = head.next;
		}
	}
	
	public void deletePosition(int position){
		Node current = head;
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			for(int i=0; i<position-2; i++){
				current = current.next;
			}
			current.next = current.next.next;
			
		}
	}
	
	public void deleteEnd(){
		Node current = head;
		if(head==null){
			System.out.println("List is empty");
		}else{
			while(current.next.next!=null){
				current = current.next;
			}
			current.next = null;
		}
	}
	
	public void search(int data){
		boolean found = false;
		Node current = head;
		
		while(current!=null){
			if(current.data==data){
				found = true;
				break;
			}
			current = current.next;
		}
		if(found){
			System.out.println(data+" is found");
		}
		else{
			System.out.println(data+" is not found");
		}
	}
	
	public void Display(){
		Node current = head;
		if(head==null){
			System.out.println("List is empty");
		}
		while(current!=null){
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String args[]){
		singlyLinkedList s1 = new singlyLinkedList();
		
		s1.Display();
		s1.addNode(5);
		s1.addNode(7);
		s1.addNode(65);
		s1.addNode(5);
		
		s1.Display();
		
		s1.addBegining(8);
		s1.Display();
		
		s1.addPosition(5, 80);
		s1.Display();
		
		s1.addEnd(55);
		s1.Display();
		
		s1.deleteBegining();
		s1.Display();
		
		s1.deletePosition(5);
		s1.Display();
		
		s1.deleteEnd();
		s1.Display();
		
		s1.search(80);
		
	}
}