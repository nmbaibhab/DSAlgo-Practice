package LinkedList;

public class delete_alternate_nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Solution {
		    
		    public void deleteAlternate (Node head){
		        //Write your code here
		        Node main = head;
		        Node dele = main.next;
		        while(main!=null && dele!=null){
		            main.next = dele.next;
		            dele=null;
		            
		            main= main.next;
		            if(main!=null)
		            dele=main.next;
		            
		        }
		        
		    }
		}
	}

}
