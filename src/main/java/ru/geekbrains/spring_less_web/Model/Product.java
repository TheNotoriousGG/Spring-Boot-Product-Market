package ru.geekbrains.spring_less_web.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String title;

    private Double cost;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
