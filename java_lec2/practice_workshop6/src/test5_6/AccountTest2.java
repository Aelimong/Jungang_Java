package test5_6;

public class AccountTest2 {

	public static void main(String[] args) {
		Account ac2[] = new Account[5];

		String account = "221-0101-211";
		for (int i = 0; i < ac2.length; i++) {
			ac2[i] = new Account(account + (i + 1), 100000, 4.5);
			ac2[i].accountInfo();
			System.out.println();
		}

		System.out.println("");
		
		
		for (int i = 0; i < ac2.length; i++) {
			ac2[i] = new Account(account + (i + 1), 100000, 3.7);
//			ac2[i].accountInfo();
//			System.out.println("\tÀÌÀÚ : "+Math.round(ac2[i].calculateInterest())+"¿ø");
			ac2[i].accountInfo2();
			
			
		}
		
		
	}

}
