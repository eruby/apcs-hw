import java.io.*;
import java.util.*;

public class MyQueue{
    private Node head, tail;
    private int size;

    public MyQueue(){
	head = null;
	tail = null;
	size = 0;
    }
    public void enqueue(String s){
	Node n = new Node(s);
	if (tail == null){
	    tail = n;
	    head = tail;
	} else {
	    tail.setNext(n);
	    tail = n;
	}
	size++;
    }

    public String dequeue(){
	String s;
	if (head == null){
	    s= null;
	} else {
	    s = head.getData();
	    head = head.getNext();
	    size--;
	    if (head == null){
		tail = null;
	    }
	}
	return s;
    }

    public String front(){
	if (head == null){
	    return null;
	} else {
	    return head.getData();
	}
    }

    public boolean isEmpty(){
	return head == null;
    }

    public String toString(){
	String s = "";
	if (head == null){
	    s = s+ "null -->";
	}
	//not finished
    }

    public static void main(String[] args){
	MyQueue q = new MyQueue;
    }
}