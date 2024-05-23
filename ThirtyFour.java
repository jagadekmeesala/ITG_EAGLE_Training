public class GFG { 
	public static void main(String[] args) 
	{ 
		int a[] = { 1, 8, 3 }; 
		int b[] = new int[a.length]; 
		for (int i = 0; i < a.length; i++) 
			b[i] = a[i]; 
		b[0]++; 
		System.out.println("a[] "); 
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " "); 
		System.out.println("\n\nb[] "); 
		for (int i = 0; i < b.length; i++) 
			System.out.print(b[i] + " "); 
	} 
}
