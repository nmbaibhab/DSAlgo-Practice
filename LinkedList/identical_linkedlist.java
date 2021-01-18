package LinkedList;

public class identical_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (head1 != null && head2!= null){
			if((head1.data & head2.data) != head1.data )
			return false;
			head1 =head1.next;
			head2 = head2.next;
			}
			return true;

	}

}
