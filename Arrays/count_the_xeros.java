package Arrays;

public class count_the_xeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/User function Template for Java

		class Solution {
		    int countZeroes(int[] arr, int n) {
		        // code here
		        int num=0;
		        for(int i=0;i<n;i++){
		            num=i;
		            if(arr[i]==0)
		            break;
		        }
		        return (n-num);
		    }

		}
	}

}
