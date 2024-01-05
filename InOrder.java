/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int b = (int) (Math.random() * 10) ; // generate a first random number
		System.out.print(b + " ");
		
		for (int i = (int) (Math.random() * 10) ; i >= b ; i = (int) (Math.random() * 10)) { // generate a new random number that i bigger than the first one 
			 	System.out.print(i + " ") ; // prints the givven number
			b = i ;
	  		}
		/* Looks interesting, we didn't teach this kind of for loops use,
		here it is better to use a while loop because you are iterating 'as long as they form a non-decreasing sequence'
		equivalent to saying  'while they form a non-decreasing sequence' */
		
	}
}
