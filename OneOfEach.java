
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		public class OneOfEachStats1 {
	public static void main (String[] args) {
		int b = 0 ; 
		int g = 0 ; 
		String child = "" ; 

		double f = Math.random() ; // 0.0-0.999
		if (f > 0.5) {
			b++ ; 
			child = child + "b " ;
		} else if (f < 0.5) {
			g++ ; 
			child = child + "g " ;

		}
		while ((b == 0) || (g == 0)) {
			f = Math.random() ;
			if (f > 0.5) {
			b++ ; 
			child = child + "b " ;

		} else if (f < 0.5) {
			g++ ; 
			child = child + "g " ;

		}
		}
		int sum = b + g ;
		System.out.println(child);
		System.out.println("You made it... and you now have " + sum + " children." );



	}
}
