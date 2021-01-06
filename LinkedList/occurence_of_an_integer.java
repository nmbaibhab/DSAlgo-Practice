package LinkedList;

public class occurence_of_an_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class GfG
		{
		    public static int count(Node head, int search_for)
		    {
		        //code here
		        Node temp= head;
		        int count=0;
		        
		        while(temp!=null){
		            int num= temp.data;
		            if(num==search_for){
		                count++;
		            }
		            temp=temp.next;
		        }
		        return count;
		    }
		}
	}

}
