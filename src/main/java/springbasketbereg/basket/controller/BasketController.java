package springbasketbereg.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springbasketbereg.basket.service.BasketService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam Integer[] idT) {
        service.add(idT);
    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return (Set<Integer>) service.getAll();
    }
}
