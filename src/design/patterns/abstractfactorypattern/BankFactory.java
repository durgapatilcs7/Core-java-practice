package design.patterns.abstractfactorypattern;

public class BankFactory extends AbstractFactory{

	final String ICIC_BANK = "ICICI";
	final String YES_BANK = "YES";
	
	@Override
	Bank getBank(String bankName) {
		if(ICIC_BANK.equals(bankName)) {
			return new ICICBank();
		}else if(YES_BANK.equals(bankName)) {
			return new YesBank();
		}
		return null;
	}

	@Override
	Account getAccount(String accountType) {
		return null;
	}

}
