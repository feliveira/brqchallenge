package com.oak.fiap.brqchallenge.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CERTIFICACAO")
public class Certificacao {

    @Id
    @SequenceGenerator(name = "certificacao", sequenceName = "seq_certificacao")
    @GeneratedValue(generator = "certificacao", strategy = GenerationType.SEQUENCE)
    private Long id;

}
