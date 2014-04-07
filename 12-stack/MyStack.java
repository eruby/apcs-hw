public class MyStack {
    private int[] a;
    private int top;
    private int numElts;

    public MyStack(){
	a = new int[10];
	top = null;
	numElts = 0;
    }

    public void grow() {
	String[] newStack = new String[stack.length + 10];
	System.arraycopy(stack, 0, newStack, 0, 10);
	stack = newStack;
    }

    public void push(int s){
        if (a[0] == null){
	    a[0] = s;
	    top = s;
	}
	if (a[length - 1] != 0){
	    grow();
	} 
	for (int i = 1; i<a.length; i++){
	    a[i] = a[i-1];
	}
	a[0] = s;
	top = s;
	
	numElts = numElts+1;
    }

    public String pop() {
	int s = top;
	for (int i=0;i<a.length-1;i++){
	    a[i] = a[i+1];
	}
	a[a.length-1] = 0;
	numElts = numElts-1;
	top = a[0];
	return s;
    }

    public String peek() {
	return top

    }
    
    public int size() {
	return numElts;
    }

    public boolean isEmpty() {
	return top==null;
    }

    public String toString() {
	String s="";

	for (Node tmp = top; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp.getData()+", ";
	}
	/*
	Node tmp = top;
	while(tmp!=null) {
	    s = s + tmp.getData()+", ";
	    tmp = tmp.getNext();
	}
	*/
	return s.substring(0,s.length()-2);
    }

    
    
 public static void main(String[] args){
	MyStack a = new MyStack();
	a.push(1);
	a.push(2);
	a.push(3);
	System.out.println(a);
	while (!a.isEmpty()){
	    System.out.println(a.pop());
	}
	a.push(4);
	System.out.println(a.peek());
	a.push(5);
	System.out.println(a.peek());


    }
}
