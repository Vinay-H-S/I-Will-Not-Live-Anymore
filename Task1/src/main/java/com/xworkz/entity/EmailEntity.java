package com.xworkz.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="email")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@NamedQuery(name="findAllByQuantity",query = "select email from EmailEntity email where email.address=:ed")
public class EmailEntity {

    @Id
    @Column(name="e_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="e_address")
    @NonNull
    private String address;

    @Column(name="e_from")
    @NonNull
    private String from;

    @Column(name="e_to")
    @NonNull
    private String to;

    @Column(name="e_cc")
    @NonNull
    private String cc;

    @Column(name="e_bcc")
    @NonNull
    private String bcc;

    @Column(name="e_sentdate")
    @NonNull
    private LocalDate sentDate;

}
