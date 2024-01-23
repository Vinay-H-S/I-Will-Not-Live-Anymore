package com.xworkz.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="toy")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToyEntity {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="color")
    private String color;

    @Column(name="cost")
    private double cost;

    @Column(name="material")
    private String material;

}
