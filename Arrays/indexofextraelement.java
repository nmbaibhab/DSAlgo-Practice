package Arrays;

public class indexofextraelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class GfG {
		    public int findExtra(int a[], int b[], int n) {
		        // add code here.
		    int i=0;
		    int val=0;
		    for(;i<n;i++){
		        if(i<b.length)
		        {
		             if(a[i]!=b[i]){
		                  val=i;
		                  break;
		            } 
		        }
		        else{
		            val=i;
		        }
		    }
		  return val;
		    }
		}
	}

}
