public class Node<E>{
    private E data;
    private Node<E> next;

    public Node(E d){
	data = d;
	next = null;
    }

    public void setData(E d){
	data = d;
    }
    public E getData(){
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }



    public static void main(String[] args){
	Node<String> n1 = new Node<String>("Sully");
	Node<String> n2 = new Node<String>("Mike");
	System.out.println(n1);
	System.out.println(n2);
	
	n1.setNext(n2);
	System.out.println(n1.getNext());

	//making a new Node, that is n2's next;
	n1.getNext().setNext(new Node("Randall"));
	System.out.println();
	System.out.println(n2.getNext());

	//this will give us Randall; 
	//same functionality as n2.getNext();
	System.out.println(n1.getNext().getNext());
	/*
	//getting rid of mike(n2)
	//RAndall becomes n1's next;
	n1.setNext(n1.getNext().getNext());
	System.out.println(n1.getNext());
	*/

	//links RAndall to n1;
	//n1 is randalls next;
	n1.getNext().getNext().setNext(n1);
    }
}
