package com.xworkz.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")
@Data
@AllArgsConstructor
public class SportsEntity {

    @Id
    @Column(name="sports_id")
    private int sports_id;

    @Column(name="Sport_name")
    private String Sport_name;

    @Column(name="team_name")
    private String team_name;

    @Column(name="state")
    private String state;



}
