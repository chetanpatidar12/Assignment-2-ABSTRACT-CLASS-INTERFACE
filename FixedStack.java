package mypackage;

public class FixedStack implements  Stack{
int stack [];
int toss;

public FixedStack(int size) {
stack=new int[size];
toss--;

}

	
	
	@Override
	public void push(int I) {
if(toss==stack.length-1)
	System.out.println("stack is full");
else 
	stack[++toss]=I;
		
	}

	@Override
	public int pop() {
	if(toss<0){
		System.out.println("stack is underflowl");
	
		return 0;
	

	}
	else {
		return stack[toss--];
	
	}
	
}
}