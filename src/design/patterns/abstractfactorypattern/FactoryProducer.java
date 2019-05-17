package design.patterns.abstractfactorypattern;
//This class creates a factory generator class to get factories by passing piece of information such as Bank or Account
public class FactoryProducer {

	final static String BANK = "BANK";
	final static String ACCOUNT = "ACCOUNT";
	
	public static AbstractFactory getFactory(String factory) {
		if(BANK.equalsIgnoreCase(factory)) {
			return new BankFactory();
		}else if(ACCOUNT.equalsIgnoreCase(factory)) {
			return new AccountFactory();
		}
		return null;
			
	}
	
}
