import java.util.Scanner;
class Atm {
	
	float Balance;
	int Pin=12;
	
	public void checkpin() {
		System.out.println("Enter Your Pin : ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if (enteredpin==Pin) {
			menu();
		}
		else {
			System.out.println("Invalid Pin");
			System.out.println();
			menu();
		}
	}
	
	public void menu() {
		System.out.println("Select Options");
		System.out.println("1 check balance");
		System.out.println("2 withdraw money");
		System.out.println("3 deposite money");
		System.out.println("4 exit");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt == 1 ) {
			checkbalance();
			
		}
		else if (opt == 2 ) {
			withdrawmoney();
			
		}else if (opt == 3) {
			depositemoney();
			
		}else if (opt == 4) {
		    return;
		}
		else {
			System.out.println("Enter a valid Option");
		}
	}
	public void checkbalance() {
		System.out.println("Balance " + Balance);
		System.out.println();
		menu();
	}
	
		public void withdrawmoney() {
			Scanner sc = new Scanner(System.in);
			float amount = sc.nextFloat();
			if (amount>Balance) {
				System.out.println("Insufficient Balance");
			}
			else {
				Balance = Balance - amount;
				System.out.println("Money withdraw succesfully");
				System.out.println();
				menu();
			}
		}
		public void depositemoney() {
			System.out.println("Enter a amount to deposite: ");
			Scanner sc = new Scanner(System.in);
			float amount = sc.nextFloat();
			Balance = Balance + amount;
			System.out.println("Money deposited Sucessfully");
			System.out.println();
			menu();
			
		}
}
public class Banky {
	public static void main(String args[]) {
		Atm obj = new Atm();
		obj.checkpin();
	}

}

