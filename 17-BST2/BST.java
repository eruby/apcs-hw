import java.util.*;
import java.io.*;

public class BST{
    private Node root;

    public class Node{
    private int data;
    private Node left, right;

	public Node(int d){
	    data = d;
	}
	public Node getLeft(){
	    return left;
	}
	public Node getRight(){
	    return right;
	}
	public void setLeft(Node l){
	    left = l;
	}
	public void setRight(Node r){
	    right = r;
	}
	public int getData(){
	    return data;
	}

	public String toString(){
	    return data + "";
	}
    }


    public BST(){
	root = null;
    }

    public Node search(int x){
	Node tmp = root;
	while (tmp != null && tmp.getData() != x){
	    if (tmp.getData() < x)
		tmp = tmp.getLeft();
	    else
		tmp = tmp.getRight();
	
	}
	return tmp;
    }

    public void insert(Node n){
	//error without this, since pg will equal null as well
	if (root == null){
	    root = n;
	}
	Node tmp = root;
	Node pg = tmp;
	while (tmp != null && tmp.getData() != n.getData()){
	    if (tmp.getData() < n.getData()){
		pg = tmp;
		tmp = tmp.getLeft();
	    }
	    else{
		pg = tmp;
		tmp = tmp.getRight();
	    }
	}
	if (tmp == null){
	    if (pg.getData() < n.getData())
		pg.setLeft(n);
	    else
		pg.setRight(n);
	}
    }

    public Node search2(Node c, int x){
	if (c == null || c.getData() == x)
	    return c;
	else {
	    if (c.getData() < x)
		c = c.getLeft();
	    if (c.getData() > x)
		c = c.getRight();

	    return search2(c,x);
	}
    }

    public void delete(int n){
	boolean right;
	Node tmp = root;
	Node piggyBack = tmp;
	if (tmp.getData() == n){
	    if (tmp.getLeft() == null && tmp.getRight()== null)
		tmp == null;
	    if else (tmp.getLeft() == null){
		    if (right ==true)
			piggyBack.setRight(tmp.getRight());
		    else
			piggyBack.setLeft(tmp.getRight());
		}
	    if else (tmp.getRight() == null){
		    if (right ==true)
			piggyBack.setRight(tmp.getLeft());
		    else 
			piggyBack.setLeft(tmp.getLeft());
		}
	    else {
		//this case gave me to many troubles, to be continued another day
	    }
	}
	else {
	    if (tmp.getData() < n){
		piggyBack = tmp;
		tmp = tmp.getLeft();
		right = false;
	    }
	    else{
		piggyBack = tmp;
		tmp = tmp.getRight();
		right = true;
	    }
	}
    }

    public static void main(String[] args){
	BST b = new BST();
    }
