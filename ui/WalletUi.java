package ui;
import dao.WalletDaoImpl;
import entities.Wallet;
import service.IWalletService;
import service.WalletServiceImpl;

import java.util.Collection;
import java.util.Set;

public class WalletUi {
    private IWalletService service = new WalletServiceImpl(new WalletDaoImpl());

    public static void main(String[] args) {
        WalletUi ui = new WalletUi();
        ui.runUi();
    }

    public void runUi() {
        try {
            Wallet w1 = new Wallet("7899","Ram", 7000);
            Wallet w2=new Wallet("6755","Sam",7000);
            service.addWallet(w1);
            service.addWallet(w2);
            Wallet fetched1 = service.findBymobno("7899");
            Wallet fetched2 = service.findBymobno("6755");
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println("printing all wallets");
            Set<Wallet> wallets = service.allWallets();
            print(wallets);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Wallet>wallets){
        for (Wallet w:wallets){
            System.out.println(w.getName());
        }
    }
}
