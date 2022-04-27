package com.oak.fiap.brqchallenge.resource;

import com.oak.fiap.brqchallenge.repository.CertificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("certificacoes")
public class CertificacaoResource {

    @Autowired
    CertificacaoRepository repository;

}
