public class Numbers {
	public static void main(String args[]) {
		int n = 4;
		int i; int j;
		for (i=1; i<= n; i++) {
			for(j=1; j<=n; j++) {
				if( j>=i) {
					System.out.print(j + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (i=n-1; i>= 1; i--) {
			for(j=1; j<=n; j++) {
				if( j>=i) {
					System.out.print(j + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
}
}
