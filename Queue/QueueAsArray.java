import java.util.*;

class QueueAsArray{
	String qArray[] = new String[5];
	int size = qArray.length-1;
	int front = 0;
	int rear = -1;
	
	public boolean isEmpty(){
		return (rear==-1);
	}
	
	public boolean isFull(){
		return (rear==size);
	}
	
	public void enQueue(String data){
		if(isFull()){
			System.out.println("Queue Overflow");
		}else{
			qArray[++rear] = data;
		}
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Queue underflow");
		}else{
			for(int i=front; i<=rear; i++){
				System.out.print(qArray[i]+" ");
			}
		}
		System.out.println();
	}
	public void deQueue(){
		if(isEmpty()){
			System.out.println("Queue underflow");
		}else{
			System.out.println("Deleted Element :- "+qArray[front]);
			qArray[front++] = ""; 
			
			if(front>rear){
				System.out.println("This is last element in the queue");
				front=0;
				rear=-1;
			}
		}
	}
	public String peek(){
		if(isEmpty()){
			System.out.println("Queue underflow");
			return "";
		}else{
			return qArray[front];
		}
		
	}
	public static void main(String[] args){
		QueueAsArray q = new QueueAsArray();
		q.enQueue("2");
		q.enQueue("4");
		q.enQueue("6");
		q.display();
		
		q.deQueue();
		q.display();
	}
	
}