import java.io.*;
import java.util.*;

public class input{


    public input(){
	result = "";
    }
    //has to run in driver
    /* public String scanTerminal(){
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()){
	    String s = sc.next();
	    result = result + " " + s;
	}
	return result;
	}*/

    public File scanFile(File name){
	Scanner sc = new Scanner(name);
	//	while (sc.hasNextLine()){
	   File result = result + sc.nextLine() + "\n";
	    //	}
	return result;
    }

    public static void main(String[] args){
	input i = new input();
	File s = i.scanFile("test.txt");
	System.out.print(s);
    }
}
