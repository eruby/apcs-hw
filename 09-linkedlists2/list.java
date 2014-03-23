import java.io.*;
import java.util.*;

public class list{
    private Node head;
    
    public list(){
	head = new Node("");
    }
     public void add1(String s){
	Node tmp = new Node(s);
	tmp.setNext(head.getNext());
	head.setNext(tmp);
     }
    public void add2(int i,String s){
	Node tmp = head.getNext();
        for (int j=1; j<i-1;j++){
	    tmp = tmp.getNext();
	    }
	Node n = new Node(s);
	n.setNext(tmp.getNext());
	tmp.setNext(n);
    
    }
    public String get(int i){
	int n = 0;
	Node tmp = head.getNext();
	//	System.out.println(tmp.getData());
	while (n<i){
	    tmp.getNext();
	    System.out.println(tmp.getData());
	    n++;
	}
	return tmp.getData();
    }
    public String set(int i, String s){
	Node tmp = head.getNext();
	for (int j=1;j<i;j++){
	    tmp = tmp.getNext();
	}
	String d = tmp.getData();
	tmp.setData(s);
	return d;
    }
    public String remove(int i){
	Node T2=head;
	Node tmp = head.getNext();
	for (int j=0;j<i;j++){
	    T2 = tmp;
	    tmp = tmp.getNext();
	}
	String d = tmp.getData();
	T2.setNext(tmp.getNext());
	return d;
    }
    public int find(String s){
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
	while (tmp != null){
	    tmp = tmp.getNext();
	    l++;
	}
	return l;
    }


    public String toString(){
	String s = "";
        Node tmp = head.getNext();
	while (tmp!=null){
	    s += tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    public static void main(String[] args){
	list L = new list();

       	L.add1("Sara");
       	System.out.println(L);
       	L.add1("mike");
	//	System.out.println(L);
	L.add1("randall");
	//	System.out.println(L);
      	L.add2(1,"Sully");
       	System.out.println(L);
	//	System.out.println(L.get(0));
	System.out.println(L.get(1));
	/*	L.set(2, "EMILY");
	L.remove(1);
	System.out.println(L);
        System.out.println(L.size());*/

    }
}
