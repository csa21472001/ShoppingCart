package sky.pro.Shopping.Project.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(HashSet<Integer> goods) {
        goods.forEach(cart::add);
    }

    @Override
    public HashSet<Integer> get() {
        return cart.getGoods();
    }

}
