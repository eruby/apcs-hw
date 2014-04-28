import java.util.*;
import java.io.*;

public class BST{
    private Node root;

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

    public static void main(String[] args){
	BST b = new BST();
	b.insert(new Node(10));
	b.insert(new Node(8));
	b.insert(new Node(13));
	System.out.println(b.search(13));
	System.out.println(b.search2(b.root,3));
    }
}
