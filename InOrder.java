/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int first = (int) (Math.random() * 10) ;
		System.out.print(first + " ");

		int i = (int) (Math.random() * 10) ;
		if (i >= first) {
		System.out.print(i);

		}
		
	
	}
}
