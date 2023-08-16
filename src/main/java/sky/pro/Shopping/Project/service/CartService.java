package sky.pro.Shopping.Project.service;

import java.util.List;


public interface CartService {
    void add(List<Integer> goods);

    List<Integer> get();

}
