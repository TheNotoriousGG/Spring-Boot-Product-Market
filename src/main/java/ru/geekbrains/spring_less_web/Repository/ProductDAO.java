package ru.geekbrains.spring_less_web.Repository;

import ru.geekbrains.spring_less_web.Model.Product;

import java.util.List;

public interface ProductDAO {

        Product findById(Long id);

        List<Product> findAll();

        Product findByTitle(String title);

        void save(Product product);

        void delete(Product product);
}
