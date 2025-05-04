package repository;

import model.Wallet;

import java.util.ArrayList;
import java.util.List;

public class WalletRepository {
    private List<Wallet> wallets = new ArrayList<>();
    private int nextId = 1;

    public Wallet add(Wallet wallet) {
        wallet.setId(nextId++);
        wallets.add(wallet);
        return wallet;
    }

}
