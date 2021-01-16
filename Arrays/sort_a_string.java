package Arrays;


import java.util.*;
import java.lang.*;
import java.io.*;
public class sort_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testcase= sc.nextInt();
		while(testcase!=0){
		    int n=sc.nextInt();
		    String str=sc.next();
		    
		    char ch[] = str.toCharArray();
		    
		    Arrays.sort(ch);
		    for(int j=0;j<n;j++)
		    System.out.print(ch[j]);
		    System.out.println();
		    
		    
		    testcase--;
		}
	}
}

	}

}
