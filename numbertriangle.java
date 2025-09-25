package patterns;

public class numbertriangle {
	public static void main(String[] args) {
		starprinter(4);
	}
	public static void starprinter(int n) {
		for (int i = 1; i <=n; i++) { //rows
			for (int j = 1; j <=n-i; j++) { //spaces
				System.out.print(" ");
			    }
				for (int k = 1; k <=i; k++) { //number
					System.out.print(i+" ");
				}
			System.out.println();
		}
	}

}
