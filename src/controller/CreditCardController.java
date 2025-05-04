package controller;

import model.CreditCard;
import repository.CreditCardRepository;

public class CreditCardController {
    private final CreditCardRepository creditCardRepository;

    public CreditCardController(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    public CreditCard addCreditCard(String name, double balance, double creditLimit) {
        CreditCard card = new CreditCard(0, name, balance, creditLimit);
        return creditCardRepository.add(card);
    }
}
