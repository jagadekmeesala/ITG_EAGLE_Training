public class Numbers {
	public static void main(String args[]) {
		int n = 7;
		int i; int j;
		for (i=1; i<= n; i++) {
			for(j=1; j<= 2*i-1; j++) {
				if( i==j) {
					System.out.print(i);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
