package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nearly_sorted_algo {
	
		public static void main (String[] args) {
			//code
			Scanner sc= new Scanner(System.in);
		    int tcase=sc.nextInt();
		    while(tcase!=0){
		        int n=sc.nextInt();
		        int k=sc.nextInt();
		        int arr[]=new int[n];
		        
		        for(int i=0;i<n;i++){
		            arr[i]=sc.nextInt();
		        }
		        Arrays.sort(arr);
		        for(int i=0;i<n;i++)
		        System.out.print(arr[i]+" ");
		        System.out.println();
		        tcase--;
		    }
		}
	}

