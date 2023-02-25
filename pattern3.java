public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n =4;
		int j;
		for(i=1;i<=n;i++) {
			int alph =65;
			for(j=1;j<=i;j++) {
			System.out.print((char)alph);
			alph++;
			}
			System.out.println();
		}

	}

}
/* Output
  A
  A B
  A B C
  A B C D 
*/