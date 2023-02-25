
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n =4;
		int j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if (i==j&&(i==2||i==3)||(i==2&&j==3)||(j==2&&i==3)) {
					System.out.print(" ");
				}
				else {
					System.out.print("$");
				}
			}
			System.out.println();
		}

	}

}
/* Output
  $ $ $ $
  $     $
  $     $
  $ $ $ $
*/