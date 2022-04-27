package com.oak.fiap.brqchallenge.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_SKILL")
public class Skill {

    @Id
    @SequenceGenerator(name = "skill", sequenceName = "seq_skill")
    @GeneratedValue(generator = "skill", strategy = GenerationType.SEQUENCE)
    private Long id;

}
