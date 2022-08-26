package com.david.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.models.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
    
}
