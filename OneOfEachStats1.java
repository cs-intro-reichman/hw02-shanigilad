/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int sumchild = 0 ;
		int n2 = 0 ;
		int n3 = 0 ;
		int n4 = 0 ;

		for(int i = 0 ; i < T ; i++) {

			int b = 0 ; 
			int g = 0 ;

			double f = Math.random() ; // 0.0-0.999
				if (f > 0.5) {
					b++ ; 
				} else if (f < 0.5) {
					g++ ; 

				}
				while ((b == 0) || (g == 0)) {
				f = Math.random() ;
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
		/* same comments as OneOFEachStats.java */
		}
		}
