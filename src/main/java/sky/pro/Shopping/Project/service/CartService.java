package sky.pro.Shopping.Project.service;

import java.util.HashSet;
import java.util.List;


public interface CartService {
    void add(HashSet<Integer> goods);

    HashSet<Integer> get();

}
