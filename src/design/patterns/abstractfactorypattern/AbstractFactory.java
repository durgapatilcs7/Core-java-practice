package design.patterns.abstractfactorypattern;

public abstract class AbstractFactory {

	abstract Bank getBank(String bankName);
	abstract Account getAccount(String accountType);
}
