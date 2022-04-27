package com.oak.fiap.brqchallenge.repository;

import com.oak.fiap.brqchallenge.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

}
