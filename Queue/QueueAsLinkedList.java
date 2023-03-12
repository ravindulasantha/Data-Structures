class QueueAsLinkedList{
	QueueNode front = null;
	QueueNode rear = null;
	
	class QueueNode{
		int data;
		QueueNode next;
		
		public QueueNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty(){
		return front==null;
	}
	public void EnQueue(int data){
		QueueNode newNode = new QueueNode(data);
		
		if(isEmpty()){
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
	}
	public void DeQueue(){
		if(isEmpty()){
			System.out.println("Queue underflow");
		}else{
			front = front.next;
			if(front==null){
				rear = null;
			}
		}
	}
	public void display(){
		QueueNode current = front;
		if(isEmpty()){
			System.out.println("Queue underflow");
		}else{
			while(current!=null){
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		QueueAsLinkedList q = new QueueAsLinkedList();
		q.EnQueue(2);
		q.EnQueue(4);
		q.EnQueue(5);
		q.display();
		
		q.DeQueue();
		q.display();
	}
}