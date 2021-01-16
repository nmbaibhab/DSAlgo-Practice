package Arrays;

public class smallest_positive_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Missing {
		    
		    // function to find first positive missing number
		    static int missingNumber(int arr[], int n)
		    {
		        int min=0;
		        int index=0;
		        Arrays.sort(arr);
		        int max=arr[n-1]; 
		        for(int i=0;i<n;i++){
		            if(arr[i]>0){
		                min=arr[i];
		                index=i;
		                break;
		            }
		        }
		        if(min>1)
		        return 1;
		        else{
		           for(int j=index;j<n;j++){
		            if(arr[j]==min || arr[j]==arr[j-1] ){
		                min=arr[j];
		                min=min+1;  
		            }
		            else 
		            return min;
		            } 
		        }
		        return (arr[n-1])+1;
		        
		    }
		   
		    
		}

	}

}
