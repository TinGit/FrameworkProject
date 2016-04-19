package account;

public interface ITransaction {
	public void handle();
	public void notifyCustomer();
}
