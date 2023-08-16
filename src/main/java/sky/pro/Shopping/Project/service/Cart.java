package sky.pro.Shopping.Project.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> goods;

    public Cart() {
        this.goods = new ArrayList<>();
    }

    public void add(Integer good) {
        goods.add(good);
    }

    public List<Integer> getGoods() {
        return goods;
    }

}

