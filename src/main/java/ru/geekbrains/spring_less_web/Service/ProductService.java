package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void changeScore(Long id, Double cost){
        Product product = repository.findById(id);
        product.setCost(product.getCost() + cost);
        // repostitory.save(client);
    }

}
