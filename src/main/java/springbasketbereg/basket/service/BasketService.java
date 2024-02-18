package springbasketbereg.basket.service;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add(Integer... idT) {
        basket.add(idT);
    }

    public Collection<Integer> getAll() {
        return basket.getAll();
    }
}
