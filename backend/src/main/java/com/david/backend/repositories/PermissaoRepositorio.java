package com.david.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.models.Permissao;

public interface PermissaoRepositorio extends JpaRepository<Permissao, Long> {
    
}
