import java.io.*;
import java.util.*;


public class MyLinkedList{
    private Node head;
    private Node tail;
    
    public MyLinkedList(){
	head = null;
	tail = null;

    }
     public void add1(String s){
	Node tmp = new Node(s);
	if (head == null){
	    tmp.setNext(tail);
	    head = tmp;
	}
	if (head.getNext() == null){
	    head.setNext(tmp);
	    tail = tmp;
	    
	}
        else{
	    tail.setNext(tmp);
	    tail = tmp;
	}
	    
     }
    public void add2(int i,String s){
	Node tmp = head;
        for (int j=0; j<i-1;j++){
	    tmp = tmp.getNext();
	    }
	Node n = new Node(s);
	n.setNext(tmp.getNext());
	tmp.setNext(n);
	if (tmp == tail){
	    tail = n;
	}
    }

    public void addTail(String s){
	int x = this.size();
	add2(x,s);
    }
    
    public String get(int i){
	Node tmp = head;
	for(int j=0;j<i;j++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }
    public String set(int i, String s){
	Node tmp = head;
	for (int j=0;j<i;j++){
	    tmp = tmp.getNext();
	}
	String d = tmp.getData();
	tmp.setData(s);
	return d;
    }
    public String remove(int i){
	Node tmp = head;
	for (int j=0;j<i-1;j++){
	    tmp = tmp.getNext();
	}
	String d = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return d;
    }
    public int find(String s){
	Node tmp = head;
	int index = 0;
	while (tmp != null){
	    if (tmp.getData().equals(s)){
		return index;
	    }
	    tmp = tmp.getNext();
	    index++;
	}
	return -1;
    
      }
    public int size(){
	int l = 0;
	Node tmp = head;
	while (tmp != null){
	    tmp = tmp.getNext();
	    l++;
	}
	return l;
    }


    public String toString(){
	String s = "";
        Node tmp = head;
	while (tmp!=null){
	    s += tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();

       	L.add1("Sara");
	//	System.out.println(L);
       	L.add1("mike");
	//	System.out.println(L);
	L.add1("randall");
	//	System.out.println(L);
      	L.add2(1,"Sully");
	// 	System.out.println(L);
	//	System.out.println(L.get(2));
	//	L.set(2, "EMILY");
	//	L.remove(1);
	//	System.out.println(L);
	L.addTail( "TALI");
    	System.out.println(L);

    }
}
