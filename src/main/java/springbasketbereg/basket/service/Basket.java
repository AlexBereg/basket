package springbasketbereg.basket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

import static java.util.Collections.*;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> items = new HashSet<>();

    public void add(Integer... idT) {
        for (Integer id : idT) {
            items.add(id);
        }
    }

    public Set<Integer> getAll() {
        return Collections.unmodifiableSet(items);
    }
}
