public class MyLinkedList{
    private Node head;
    
    public MyLinkedList(){
	head = null;
    }
     public void add1(String s){
	Node tmp = new Node(s);
	head = tmp;
     }
    public void add2(int i,String s){
	Node tmp = new Node(s);
	head = tmp;
        for (int j=0; j<i;j++){
	    //  tmp.setNext(tmp.getNext().getNext());
	    tmp = tmp.getNext();
	    }

    
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
	for (int j=0;//I know it has to be the length of the list, which i cant figure out
    }
    public int length(){

    }


    public String toString(){
	String s = "";
	s = "" + head;
	return s;
    }
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();

       	L.add1("Sara");
       	System.out.println(L);
       	L.add1("mike");
       	System.out.println(L);
	L.add1("randall");
       	System.out.println(L);
       	L.add2(0,"Sully");
       	System.out.println(L);

    }
}
