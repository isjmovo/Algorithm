import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long result = 0;
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		for (int j = 0; j < n; j++) {
			a[j] = a[j] - b;
			result++;
			
			if (a[j] > 0) {
				result += Math.ceil((float) a[j] / c);
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}