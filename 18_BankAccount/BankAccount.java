public class BankAccount {
	// instance variables
	public String fullName;
	private String password;
	private int pin;
	private int accountNumber;
	private double accountBalance;

	// methods
	private BankAccount(String a, String b, int c, int d, double e) {
		fullName = a;
		password = b;
		pin = c;
		accountNumber = d;
		accountBalance = e;
		}

	private void accountInfo() {
		System.out.println("Full name: " + fullName);
		System.out.println("Password: " + password);
		System.out.println("Pin: " + pin);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balance: " + accountBalance);
		}

	private double deposit(double add) {
		accountBalance = (accountBalance + add);
		return accountBalance;
		}

        private double withdraw(double subtract) {
                accountBalance = (accountBalance - subtract);
                return accountBalance;
                }
	}
