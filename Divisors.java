/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int n = Integer.parseInt (args[0]);
		int i = 1 ; 
			while (i <= n) {
			if (n % i == 0) {
			System.out.println(i); 
					}
					i++;
		}
		/* you should have used a for loop and not while,
		when we need to run a finite number of iterations like n, we use for.
  		for(int i = 0; i < n; i++)
  		again bad indentation*/
	}
}
