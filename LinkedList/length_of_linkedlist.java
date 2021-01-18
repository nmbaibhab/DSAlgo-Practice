package LinkedList;

public class length_of_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isLengthEvenorOdd(Node head1)
		{
		//Add your code here.
		Node current = head1;
		int count=0;
		while(current!=null)
		{
		count++;
		current = current.next;
		}
		int temp = count & 1;
		if(temp == 1)
		return 1;
		else
		return 0;
		}
	}

}
