package service;

import java.util.Set;
import dao.IWalletDao;
import entities.Wallet;
import exceptions.IncorrectNumberException;

public class WalletServiceImpl implements IWalletService {
	private IWalletDao dao;

	public WalletServiceImpl(IWalletDao dao) {
		this.dao = dao;
	}

	@Override
	public void addWallet(Wallet w) {
		dao.addWallet(w);
	}

	@Override
    public Wallet findBymobno(String mobileno){
        if (mobileno==null||mobileno.length()!=10 ) {
            throw new IncorrectNumberException("Number is incorrect");
        }
        Wallet w = dao.findBymobno(mobileno);
        return w;
    }

	@Override
	public Set<Wallet> allWallets() {
		Set<Wallet> wallets = dao.allWallets();
		return wallets;
	}
}
