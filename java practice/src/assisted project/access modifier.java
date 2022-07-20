package javaprogram1;

public class accessmodifier {
	    
	    public int friends;
	    public void display() {
	        System.out.println("I am elena.");
	        System.out.println("I am having " + friends + " best friend");
	    }
	    public static void main( String[] args ) {
	        accessmodifier animal = new accessmodifier();

	        animal.friends = 2;
	        animal.display();
	    }
	}
