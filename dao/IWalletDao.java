package dao;
import java.util.Set;
import entities.Wallet;

public interface IWalletDao {

	    void addWallet(Wallet w);

	    Wallet findBymobno(String mobileno);

	    Set<Wallet> allWallets();
	}

