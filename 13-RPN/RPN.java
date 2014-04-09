import java.util.*;
import java.io.*;

public class RPN {

    public class MyStack{
	private Double[] a;
	private int top, numElts;
    

	//consider adding size();

	//constructor
	public MyStack(){
	    a = new Double[10];
	    top = -1;
	}
	// push 2
	public void push(Double s){
	    if (top >= a.length){
		Double[] x = new Double[a.length*2];
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
	public Double pop(){
	    if (!isEmpty()){
		Double s = a[top];
		top--;
		numElts--;
		return s;
	    }
	    return -2.0;
	}
	//peek
	public Double peek(){
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
    }
    MyStack m = new MyStack();
    
    public double calculate(String s){
	String n="";
	Scanner sc = new Scanner(s);
	for (int i=0;i<s.length();i++){
	    String r = sc.next();
	    switch(r){
	    case "+":
		Double q = m.pop();
		m.push(q+m.peek());
		break;
	    case "/": 
	        q = m.pop();
		m.push(q/m.peek());
		break;
	    case "*":
	        q = m.pop();
		m.push(q*m.peek());
		break;
	    case "-":
	        q = m.pop();
		m.push(q-m.peek());
		break;
	    case " ":
		if (n != ""){
		    double j = Double.parseDouble(n);
		    m.push(j);
		    n="";
		}
		break;
	    default:
		n = n + s.charAt(i);
	    }
	}
	double answer = m.peek();
	clear();
	return answer;
    }

    public void clear(){
	while (!m.isEmpty()){
	    m.pop();
	}
    }

    public static void main(String[] args){
	RPN C= new RPN();
	System.out.println(C.calculate("3 4 5 * +"));
	System.out.println(C.calculate("3 5 /"));
    }
}
