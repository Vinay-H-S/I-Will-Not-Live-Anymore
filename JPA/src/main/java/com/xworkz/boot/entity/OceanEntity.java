package com.xworkz.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ocean")
@Data
@AllArgsConstructor
public class OceanEntity {

    @Id
    @Column(name="ocean_id")
    private int ocean_id;

    @Column(name="ocean_name")
    private String ocean_name;

    @Column(name="ocean_width")
    private int ocean_width;

    @Column(name="location")
    private String location;
}
