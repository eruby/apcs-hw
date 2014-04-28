import java.util.*;
import java.io.*;

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
