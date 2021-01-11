package Arrays;

public class two_array_equalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static boolean check(long arr[],long brr[],int n)
		{
		    //Your code here
		    Arrays.sort(arr);
		    Arrays.sort(brr);
		    for(int i=0;i<n;i++){
		        if(arr[i]!=brr[i])
		        return false;
		    }
		    return true;
		    
		}
	}

}
