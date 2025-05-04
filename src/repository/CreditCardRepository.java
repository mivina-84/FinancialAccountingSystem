package repository;

import model.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class CreditCardRepository {
    private List<CreditCard> creditCards = new ArrayList<>();
    private int nextId = 1;

    public CreditCard add(CreditCard creditCard) {
        creditCard.setId(nextId++);
        creditCards.add(creditCard);
        return creditCard;
    }

}
