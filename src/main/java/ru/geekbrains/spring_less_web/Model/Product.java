package ru.geekbrains.spring_less_web.Model;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Product {


    public Product(String title, Double cost) {
        this.title = title;
        this.cost = cost;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String title;

    private Double cost;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product(Long id, String name, Double cost,Customer customer) {
        this.id = id;
        this.title = name;
        this.cost = cost;
        this.customer = customer;
    }

    public Product() {
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
