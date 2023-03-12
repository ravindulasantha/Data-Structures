class link2{
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
		}else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display(){
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
	public void addBegining(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			tail = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	public void addPosition(int position, int data){
		Node newNode = new Node(data);
		Node current = head;
		
		if(head==null){
			head = newNode;
			tail = newNode;
		}else if(current == tail){
			tail.next = newNode;
			tail = newNode;
		}else{
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
			head = newNode;
			tail = newNode;
		}
		else{
			while(current.next!=null){
				current = current.next;				
			}
			current.next = newNode;
			newNode.next = null;
		}
	}
	public void deleteBegining(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			head = head.next;
		}
	}
	public void deletePosition(int position){
		Node current = head;
		if(head==null){
			System.out.println("List is empty");
		}else{
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
			if(current.data=data){
				found = true;
				break;
			}
			current = current.next;
		}

	}
	public static void main(String[] args)
	{
		link2 s = new link2();
		s.addNode(2);
		s.addNode(4);
		s.addNode(5);
		s.addNode(6);
		s.display();
		
		s.addBegining(15);
		s.display();
		
		s.addPosition(4,70);
		s.display();
		
		s.addEnd(45);
		s.addEnd(95);
		s.display();
		
		s.deleteBegining();
		s.display();
		
		s.deletePosition(5);
		s.display();
	}
}