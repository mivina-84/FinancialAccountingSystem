package view;

import controller.CreditCardController;
import controller.WalletController;

import java.util.Scanner;

/**
 *  Вывод в консоль
 */
public class FinancialView {
    private Scanner scanner;
    private WalletController walletController;
    private CreditCardController creditCardController;

    public FinancialView(WalletController walletController, CreditCardController creditCardController) {
        this.scanner = new Scanner(System.in);
        this.walletController = walletController;
        this.creditCardController = creditCardController;
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Система учета финансов ===");
        }

    }
}
