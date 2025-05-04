package view;


import controller.CreditCardController;
import controller.WalletController;
import repository.CreditCardRepository;
import repository.WalletRepository;

public class Main {
    public static void main(String[] args) {
        WalletRepository walletRepository = new WalletRepository();
        CreditCardRepository creditCardRepository = new CreditCardRepository();

        WalletController walletController = new WalletController(walletRepository);
        CreditCardController creditCardController = new CreditCardController(creditCardRepository);

        FinancialView financialView = new FinancialView(walletController, creditCardController);
        financialView.start();
    }
}

