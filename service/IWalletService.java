package service;

import entities.Wallet;

import java.util.Set;

public interface IWalletService {
	void addWallet(Wallet w);

	Wallet findBymobno(String name);

	Set<Wallet> allWallets();
}
