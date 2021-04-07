package com.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     int id;
    String name;

    public OrderData(String name, List<Product> produstlist) {
        this.name = name;
        this.produstlist = produstlist;
    }

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    List<Product> produstlist;
}
