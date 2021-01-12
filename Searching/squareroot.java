package Searching;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class SquareRoot
		{
		     long floorSqrt(long x)
			 {
				int i=0;
				if(x==1){
				    return 1;
				}
				else{
				   for(;i<x;i++){
				    if(i*i>x)
				    break;
				}
				return (i-1); 
				}
				
			 }
		}
	}

}
