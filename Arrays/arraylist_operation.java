package Arrays;

public class arraylist_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Geeks
		{
		    // Function to insert element
		    public static void insert(ArrayList<Character> clist, char c)
		    {
		        
		        clist.add(c);
		    }
		    
		    // Function to count frequency of element
		    public static void freq(ArrayList<Character> clist, char c)
		    {
		     
		        if(clist.contains(c))
		        System.out.println(Collections.frequency(clist,c));
		        else
		        System.out.println("Not Present");
		        
		    }
		}

	}

}
