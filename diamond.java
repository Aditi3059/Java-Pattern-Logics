package patterns;

public class diamond {
	public static void main(String[] args) {
		printer(8);
	}
	public static void printer(int n) {
		for (int i = 1; i <= n/2; i++) {//rows
			for (int j = 1; j <= (n/2)-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		int num=(n/2)-1;
		for (int i = (n/2)-1; i>=1; i--) {
		    for (int j = 1; j <= num-i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
