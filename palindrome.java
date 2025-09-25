package patterns;

public class palindrome {
	public static void main(String[] args) {
		printer(4);
	}

	public static void printer(int n) {
		
		for (int i = 1; i <= n; i++) {
			int num=i;
			int num2=2;
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
				for (int k = 1; k <=i; k++) {
					System.out.print(num);
					num--;
				}
				for (int k = 2; k <=i; k++) {
					System.out.print(num2);
					num2++;
				}
			System.out.println();
		}
		
	}

}
