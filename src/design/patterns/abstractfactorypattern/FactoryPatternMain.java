package design.patterns.abstractfactorypattern;
//Provide an interface for creating families of related or dependent objects specifying their concrete classes
public class FactoryPatternMain {

	public static void main(String[] args) {
		final String BANK="BANK";
		final String ACCOUNT="ACCOUNT";
		AbstractFactory bankFactory = FactoryProducer.getFactory(BANK);
		Bank bank=bankFactory.getBank("ICICI");
		bank.bankAccount();
		Bank bank1=bankFactory.getBank("YES");
		bank1.bankAccount();
		
		AbstractFactory accountFactory = FactoryProducer.getFactory(ACCOUNT);
		Account savingAccount=accountFactory.getAccount("SAVING");
		savingAccount.accountType();
		Account currentAccount=accountFactory.getAccount("CURRENT");
		currentAccount.accountType();
	}

}
