package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="travel")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TravelEntity {

    @Id
    @Column(name="t_id")
    private int id;

    @Column(name="t_source")
    private String source;

    @Column(name="t_designation")
    private String designation;

    @Column(name="t_budget")
    private double budget;

    @Column(name="t_distance")
    private int distance;

    @Column(name="t_purpose")
    private String purpose;

    @Column(name="t_duration")
    private LocalTime duration;

    @Column(name="t_date")
    private LocalDate date;

    @Column(name="t_returndate")
    private LocalDate returnDate;

}
