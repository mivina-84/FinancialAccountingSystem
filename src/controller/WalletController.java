package controller;

import model.Wallet;
import repository.WalletRepository;

/**
 * Контроллер
 */
public class WalletController {
    private final WalletRepository walletRepository;

    public WalletController(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet addWallet(String name, double balance) {
        Wallet wallet = new Wallet(0, name, balance);
        return walletRepository.add(wallet);
    }

}
