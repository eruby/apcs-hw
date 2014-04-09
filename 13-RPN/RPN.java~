import java.util.*;
import java.io.*;

public RPN {

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

	private Scanner scan;
	private String input;

	public double calculate(String s){
	    input = s;
	    scan = new Scanner(input);
	    int x = scan.next();
	    }
	}
}