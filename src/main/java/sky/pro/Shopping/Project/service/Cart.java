package sky.pro.Shopping.Project.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final HashSet<Integer> goods;

    public Cart() {
        this.goods = new HashSet<>();
    }

    public void add(Integer good) {
        goods.add(good);
    }

    public HashSet<Integer> getGoods() {
        return goods;
    }

}

