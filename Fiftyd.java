public class Main {
	public static void main(String args[])
	{
		int i, j;
		int n=5;
		for (i = n; i > 0; i--) {
			for (j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
