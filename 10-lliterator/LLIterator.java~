import java.util.*;
import java.io.*;

public class LLIterator<E> implements Iterator<E>{
    Node<E> current;
    public LLIterator(E n){
	current = new Node<E>(n);
    }

    public boolean hasNext(){
	if (current.getNext()!= null){
	    return true;
	}
	return false;
    }

    public E next(){
	return current.getNext();
    }

    public void remove(){
	//optional
    }

}
