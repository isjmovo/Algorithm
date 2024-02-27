import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		a:
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++) {
					if (sum - 100 == arr[i] + arr[j]) {
						arr[i] = 0;
						arr[j] = 0;
						
						break a;
					}
				}
			}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) System.out.println(arr[i]);
		}
		
		sc.close();
	}
}