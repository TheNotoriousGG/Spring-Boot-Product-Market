package ru.geekbrains.spring_less_web.Model;

public class Product {

    private Long id;

    private String title;

    private Double cost;

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

    public Product(Long id, String name, Double cost) {
        this.id = id;
        this.title = name;
        this.cost = cost;
    }

    public Product() {
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
