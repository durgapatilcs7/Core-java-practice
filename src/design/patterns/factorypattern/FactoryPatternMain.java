package design.patterns.factorypattern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		AccountFactory accountFactory=new AccountFactory();
		//get an object of SavingAccount and call its accountType()
		Account savingAccount = accountFactory.getAccount("SAVING");//return ***new SavingAccount();
		//call accountType() of SavingAccount
		savingAccount.accountType();
		//get an object of CurrentAccount and call its accountType()
		Account currentAccount = accountFactory.getAccount("CURRENT");
		//call accountType() of CurrentAccount
		currentAccount.accountType();
	}

}
