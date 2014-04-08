public class MyStack{
    private String[] a;
    private int top, numElts;
    

    //consider adding size();

    //constructor
    public MyStack(){
	a = new String[10];
	top = -1;
    }
    // push 2
    public void push(String s){
	if (top >= a.length){
	    String[] x = new String[a.length*2];
	    for (int i=0; i<a.length; i++){
		x[i] = a[i];
	    }
	    a = x;
	}

	top++;
	a[top] = s;
	numElts++;
    }
    // pop
    public String pop(){
	String s = a[top];
	top--;
	numElts--;
	return s;
    }
    //peek
    public String peek(){
	return a[top];
    }
    //isEMpty
    public boolean isEmpty(){
	return top < 0;
    }
    //toString
    public String toString(){
	String s = "";

	for (int i=0; i<=top;i++){
	    s = a[i]+" "+ s;
	} 
	return s;
    }

    public static void main(String[] args){
	MyStack a = new MyStack();
	a.push("one");
	a.push("two");
	a.push("three");
	System.out.println(a);
	a.pop();
	a.pop();
	System.out.println(a);
    }
}