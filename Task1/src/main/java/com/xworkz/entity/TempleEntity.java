package com.xworkz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="temple")
@NoArgsConstructor
@Data
@RequiredArgsConstructor
@NamedQuery(name="findAllByLocation",query="select temple from TempleEntity temple where temple.location=:tl")
@NamedQuery(name = "findAllByEntryFeeGreaterThan",query="select temple from TempleEntity temple  where temple.entryFee >:tf")
@NamedQuery(name="findAllByInaguratedDateGreaterThan",query="select temple from TempleEntity temple where temple.inaguratedDate >:td")
@NamedQuery(name="findById",query="select temple from TempleEntity temple where temple.id=:tid")
@NamedQuery(name="findAllByEntryFeeBetween",query="select temple from TempleEntity temple where temple.entryFee between :sf and :ef")
@NamedQuery(name="findAllByMainGodAndLocation",query="select temple from TempleEntity temple where temple.mainGod =:tm and temple.location=:tl")
@NamedQuery(name="findByIdAndMainGod",query="select temple from TempleEntity temple where temple.id =:ti and temple.mainGod=:tm")
@NamedQuery(name="findTotal",query="select count(t) from TempleEntity t")
//@NamedQuery(name="findTempleByMaxEntryFee",query="select temple from TempleEntity temple where temple.entryFee=(select max(entryFee) from TempleEntity")
@NamedQuery(name="findAll",query="select temple from TempleEntity temple where name=:templeName")
@NamedQuery(name="updateLocationAndDimensionById",query="select temple from TempleEntity temple where temple.id=:templeId")
@NamedQuery(name="updateAllVipEntry",query="select temple from TempleEntity temple where temple.id=:templeId")
public class TempleEntity {

    @Id
    @Column(name="t_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="t_name")
    @NonNull
    private String name;

    @Column(name="t_location")
    @NonNull
    private String location;

    @Column(name="t_entryfee")
    @NonNull
    private double entryFee;

    @Column(name="t_vipentry")
    @NonNull
    private boolean vipEntry;

    @Column(name="t_inagurateddate")
    @NonNull
    private LocalDate inaguratedDate;

    @Column(name="t_maingod")
    @NonNull
    private String mainGod;

    @Column(name="t_dimesion")
    @NonNull
    private String dimension;


}
