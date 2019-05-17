package design.patterns.abstractfactorypattern;

public class AccountFactory extends AbstractFactory{

	final String CURRENT_ACCOUNT = "CURRENT";
	final String SAVING_ACCOUNT = "SAVING";
	
	@Override
	Bank getBank(String bankName) {
		return null;
	}

	@Override
	Account getAccount(String accountType) {
		if(CURRENT_ACCOUNT.equals(accountType)) {
			return new CurrentAccount();
		}else if(SAVING_ACCOUNT.equals(accountType)) {
			return new SavingAccount();
		}
		return null;
	}

	

}
