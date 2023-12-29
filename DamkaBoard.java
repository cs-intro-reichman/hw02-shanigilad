/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		for(int i = 0 ; i < n ; i++){ // make sure that there is n lines
				if (i % 2 != 0) {
				System.out.print(" ") ;
				}
					for (int j = 0 ; j <n ; j++){ // prints n stars
					System.out.print("* ") ;
					}
				System.out.println() ;
		}
	}
}
