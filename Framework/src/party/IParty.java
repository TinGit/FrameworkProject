package party;

import java.util.List;

import fincom.IAccount;

public interface IParty {
	
	public void addAccount(IAccount account);
	public void removeAccount(IAccount account);
}
