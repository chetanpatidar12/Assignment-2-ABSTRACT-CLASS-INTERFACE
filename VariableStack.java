package mypackage;

public class VariableStack implements Stack{

	int toss;
	int stack[];
	
	public VariableStack(int size) {
		stack=new int [size];
		toss=-1;
		
	}
	
	@Override
	public void push(int I) {
		if(toss==stack.length-1 ){
			int temp[]=new int[stack.length*2];
			for(int i=0; i<stack.length; i++) 
				temp[i] = stack[i]; 
			 stack = temp;       stack[++toss] = I;    
			 }    
		      else     
		     stack[++toss] = I;  
		}  
	 
	@Override
	  public int pop() { 
		if(toss < 0) {      
			System.out.println("Stack underflow.");   
			return 0;     
			}     
		else       
		    return stack[toss--];
		}
	}
