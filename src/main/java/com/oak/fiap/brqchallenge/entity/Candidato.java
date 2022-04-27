package com.oak.fiap.brqchallenge.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CANDIDATO")
public class Candidato {

    @Id
    @SequenceGenerator(name = "candidato", sequenceName = "seq_candidato")
    @GeneratedValue(generator = "candidato", strategy = GenerationType.SEQUENCE)
    private Long id;

}
