package ru.geekbrains.spring_less_web.Repository;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Utils.SessionFactoryUtils;

import java.util.List;

@Component
public class ProductRepository implements ProductDAO{

    SessionFactoryUtils sessionFactoryUtils;

    @Autowired
    public void setSessionFactoryUtils(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    @Override
    public Product findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class,id);
            session.getTransaction().commit();
            return product;
        }
    }

    @Override
    public List<Product> findAll() {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            List<Product> products = session.createQuery("select p from Product p").getResultList();
            session.getTransaction().commit();
            return products;
        }
    }

    @Override
    public Product findByTitle(String title) {
        return null;
    }

    @Override
    public void save(Product product) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            session.saveOrUpdate(product);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Product product) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            session.delete(product);
            session.getTransaction().commit();
        }
    }


}
