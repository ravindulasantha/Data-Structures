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
			for(int i=front; i<rear; i++){
				System.out.print(qArray[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args){
		QueueAsArray q = new QueueAsArray();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(6);
		q.display();
	}
	
}