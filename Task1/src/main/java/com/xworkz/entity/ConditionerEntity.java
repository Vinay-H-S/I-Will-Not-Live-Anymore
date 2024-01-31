package com.xworkz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="conditioner")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@NamedQuery(name="updateLiquidVolumeByBrand",query="select ct from ConditionerEntity ct where ct.brandName=:bn")
@NamedQuery(name="findAllByHairType",query="select ct from ConditionerEntity ct where ct.hairType=:ht")
@NamedQuery(name="findScentById",query="select ct from ConditionerEntity ct where ct.id=:cid")
@NamedQuery(name="getAllSize",query="select count(c) from ConditionerEntity c")
@NamedQuery(name="getAllBrand",query="select c.brandName from ConditionerEntity c")
public class ConditionerEntity {

    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="c_brandname")
    @NonNull
    private String brandName;

    @Column(name="c_hairtype")
    @NonNull
    private String hairType;

    @Column(name="c_liquidvolume")
    @NonNull
    private int liquidVolume;

    @Column(name="c_countryoforigin")
    @NonNull
    private String countryOfOrigin;

    @Column(name="c_prize")
    @NonNull
    private double prize;

    @Column(name="c_scent")
    @NonNull
    private String scent;



}
