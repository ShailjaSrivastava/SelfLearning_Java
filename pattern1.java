public class pattern1 {
	public static void main(String[] args) {
		int i;
		int n =6;
		int j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);//print prints in same line
				}
			System.out.println();//println prints in next line
		}
	}
}
/* Output
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
  1 2 3 4 5 6
*/