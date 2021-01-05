package Arrays;

public class num_divby3_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		static int isPossible(int N, int arr[]){
	        // code here
	        int sum=0;
	        for(int i=0;i<N;i++)
	        sum=sum+arr[i];
	       if(sum%3==0)
	    	return 1;
	       else 
	    	return 0;
	}

}
