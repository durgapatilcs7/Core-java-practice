package design.patterns.factorypattern;
//method in factory class takes one or more  argument and return type is Account.
//This method is also known as factory method bcoz its returns object of class
public class AccountFactory {

	final String CURRENT_ACCOUNT = "CURRENT";
	final String SAVING_ACCOUNT = "SAVING";
	//Use getAccount method to get object of type account
	//It is factory method for object of type Account
	public Account getAccount(String accountType) {
		if(CURRENT_ACCOUNT.equals(accountType)) {
			return new CurrentAccount();
		}
		else if(SAVING_ACCOUNT.equals(accountType)) {
			return new SavingAccount();
		}
		return null;
	}
}
