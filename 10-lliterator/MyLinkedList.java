import java.io.*;
import java.util.*;


public class MyLinkedList<E> implements iterable{
    private Node<E> head;
    private Node<E> tail;
    
    public MyLinkedList(){
	head = null;
	tail = null;

    }
    public LLIterator iterator(){
	E n = head.getData();
	return new LLIterator(n);
    }
     public void add1(E s){
	Node<E> tmp = new Node<E>(s);
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
    public void add2(int i,E s){
	Node<E> tmp = head;
        for (int j=0; j<i-1;j++){
	    tmp = tmp.getNext();
	    }
	Node<E> n = new Node<E>(s);
	n.setNext(tmp.getNext());
	tmp.setNext(n);
	if (tmp == tail){
	    tail = n;
	}
    }

    public void addTail(E s){
	int x = this.size();
	add2(x,s);
    }
    
    public E get(int i){
	Node<E> tmp = head;
	for(int j=0;j<i;j++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }
    public E set(int i, E s){
	Node<E> tmp = head;
	for (int j=0;j<i;j++){
	    tmp = tmp.getNext();
	}
	E d = tmp.getData();
	tmp.setData(s);
	return d;
    }
    public E remove(int i){
	Node<E> tmp = head;
	for (int j=0;j<i-1;j++){
	    tmp = tmp.getNext();
	}
	E d = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return d;
    }
    public int find(E s){
	Node<E> tmp = head;
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
	Node<E> tmp = head;
	while (tmp != null){
	    tmp = tmp.getNext();
	    l++;
	}
	return l;
    }


    public String toString(){
	String s = "";
        Node<E> tmp = head;
	while (tmp!=null){
	    s += tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    public static void main(String[] args){
	MyLinkedList<String> L = new MyLinkedList<String>();

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
