package com.xworkz.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="shop")
@Data
@AllArgsConstructor
public class ShopEntity {

    @Id
    @Column(name="shop_id")
    private int shop_id;

    @Column(name="shop_name")
    private String shop_name;

    @Column(name="owner_name")
    private String owner_name;

    @Column(name="location")
    private String location;
}
