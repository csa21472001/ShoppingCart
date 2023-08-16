package sky.pro.Shopping.Project.controller;

import org.springframework.web.bind.annotation.*;
import sky.pro.Shopping.Project.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Integer> goods) {
        cartService.add(goods);
        return "Goods added!";
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }
}
