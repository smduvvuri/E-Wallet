package dao;
import entities.Wallet;
import exceptions.WalletNotFoundException;

import java.util.*;

public class WalletDaoImpl implements IWalletDao {
	private Map<String, Wallet> store=new HashMap<>();
	
	 @Override
	    public void addWallet(Wallet w) {
	        store.put(w.getMobileNo(), w);
	    }

	    @Override
	    public Wallet findBymobno(String mobileno) {
	        Wallet w = store.get(mobileno);
	        if (w == null) {
	            throw new WalletNotFoundException("Wallet not found for mobile no=" +mobileno);
	        }
	        return w;
	    }

	    @Override
	    public Set<Wallet> allWallets() {
	        Collection<Wallet> wallets = store.values();
	        Set<Wallet> WalletSet = new HashSet<>(wallets);
	        return WalletSet;
	    }
	}

