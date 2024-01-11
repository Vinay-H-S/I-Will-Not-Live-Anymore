package com.xworkz.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traffic")
@Data
@AllArgsConstructor
public class TrafficEntity {

    @Id
    @Column(name="traffic_id")
    private int traffic_id;

    @Column(name="light_company")
    private String light_company;

    @Column(name="light_type")
    private String light_type;

    @Column(name="solor_power")
    private String solor_power;

    @Column(name="color")
    private String color;

}
