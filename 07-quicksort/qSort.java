import java.io.*;
import java.util.*;

public class qSort{
    
    public int[] Sort(int[] l){
	if (l.length <=1){
	    return l;
	}
	else{
	    int pivot = (int)(Math.random() * l.length);
	    ArrayList<Integer> p = new ArrayList<Integer>();
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    for (int i=0;i<l.length;i++){
		if (l[i] < l[pivot]){
		    lower.add(l[i]);
		}
		else if (l[i] == l[pivot]){
		    p.add(l[i]);
		}
		else{
		    upper.add(l[i]);
		}
	    }
	    //	    int[] ua = upper.toArray(new int[upper.size()]);
	    System.out.println(toArray(upper));
	    return l;
	}

    }

    public int[] toArray(ArrayList<Integer> a){
	int[] b = new int[a.size()];
	b = (int[]) a.toArray();
	return b;
    }

    public String toString(int[] a){
	return Arrays.toString(a);
    }

    public static void main (String[] args){
	qSort q = new qSort();
	
	int n = 20;
	Random rnd = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]=rnd.nextInt(100);

	q.Sort(a);
    }

}
