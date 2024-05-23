public class Frequency {
	public static void main(String args[]) {
		int n = 3;
		int i; int j;
		for (i=1; i<= n; i++) {
			for(j=1; j<=n; j++) {
				if( i+j > 3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int k = 1; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i =3; i>=1; i--){
		  for(j=1; j<=n; j++) {
				if( i+j > 3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int k = 1; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
