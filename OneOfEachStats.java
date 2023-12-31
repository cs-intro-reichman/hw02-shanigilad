import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);  
		int sumchild = 0 ;
		int n2 = 0 ;
		int n3 = 0 ;
		int n4 = 0 ;

		for(int i = 0 ; i < T ; i++) {

			int b = 0 ; 
			int g = 0 ;

			double f = generator.nextDouble(); ; // 0.0-0.999
				if (f > 0.5) {
					b++ ; 
				} else if (f < 0.5) {
					g++ ; 

				}
				while ((b == 0) || (g == 0)) {
				f = generator.nextDouble(); ;
				if (f > 0.5) {
				b++ ; 
				} else if (f < 0.5) {
				g++ ; 
				}
				}

				int sum = b + g ; 
					if (sum == 2) {
						n2++ ;
					}
					else if (sum == 3) {
						n3++ ; 
					}
					else { 
						n4++ ;
					}
					sumchild = sumchild + sum ;
					}
					

						double average = ((double) sumchild / T) ; 
						System.out.println("Average: " + average + " children to get at least one of each gender.") ;

						System.out.println("Number of families with 2 children: " + n2) ; 
						System.out.println("Number of families with 3 children: " + n3) ; 
						System.out.println("Number of families with 4 or more children: " + n4) ; 

						if (n2 > n3 && n2 > n4) {
							System.out.println("The most common number of children is 2.") ; 
						}
						else if (n3 > n2 && n3 > n4) {
						System.out.println("The most common number of children is 3.") ; 
						}
						else if (n4 > n2 && n4 > n3) {
						System.out.println("The most common number of children is 4 or more.") ; 
						} 
						else if (n2 == n3) {
						System.out.println("The most common number of children is 2.") ; 
						}
						else if (n2 == n4) {
						System.out.println("The most common number of children is 2.") ; 
						}
						else if (n3 == n4) {
						System.out.println("The most common number of children is 3.") ; 
						}
						else if (n2 == n3 && n3 == n4) {
						System.out.println("The most common number of children is 2.") ; 
						}
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
		}
	}

		





		
	