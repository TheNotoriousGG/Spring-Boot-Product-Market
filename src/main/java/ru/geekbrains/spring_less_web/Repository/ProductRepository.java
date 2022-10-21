package ru.geekbrains.spring_less_web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.spring_less_web.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


}
