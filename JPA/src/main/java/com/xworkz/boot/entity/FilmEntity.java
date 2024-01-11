package com.xworkz.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Films")
@Data
@AllArgsConstructor
public class FilmEntity {

@Id
@Column(name="film_id")
private int film_id;

@Column(name="film_name")
private String film_name;

@Column(name="actor_name")
private String actor_name;

@Column(name="actress_name")
private String actress_name;

@Column(name="film_cost")
private double film_cost;


}
