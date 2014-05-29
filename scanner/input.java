import java.io.*;
import java.util.*;

public class input{
   

    public static void main(String[] args){
	
	//reads from terminal
	System.out.println("Enter data here:");
	String result = "";
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
       
	System.out.println(s);

	//reads in a file
	File f = new File("test.txt");
	try{
	Scanner fsc = new Scanner(f);
	while (fsc.hasNextLine()){
	    result = result+ "\n" + fsc.next();
	}
	}catch (Exception e){

	}
	

	System.out.println(result);
    }
}
