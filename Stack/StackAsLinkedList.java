class StackAsLinkedList{
	class StackNode{
		String data;
		StackNode next;
		
		public StackNode(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	public StackNode top = null;
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public void push(String data){
		StackNode newNode = new StackNode(data);
		
		if(isEmpty()){
			top = newNode;
		}
		else{
			newNode.next = top;
			top = newNode;
		}
		System.out.println(data+" pushed to stack");
	}
	public void pop(){
		//String popped = "Nothing";
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			//popped = top.data;
			top = top.next;
			
		}
		//return popped;
	}
	public String peek(){
		
		if(isEmpty()){
			System.out.println("Stack is empty");
			return "Nothing";
		}else{
			return top.data;
		}
		
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			StackNode temp = top;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		StackAsLinkedList s = new StackAsLinkedList();
		s.push("2");
		s.push("4");
		s.push("5");
		s.push("8");
		s.display();
		
		s.pop();
		s.display();
	}
}