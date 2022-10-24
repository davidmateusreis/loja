package com.david.backend.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.backend.dtos.PessoaClienteRequestDto;
import com.david.backend.models.Pessoa;
import com.david.backend.repositories.PessoaClienteRepositorio;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaClienteRepositorio pessoaClienteRepositorio;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    public Pessoa registrar(PessoaClienteRequestDto pessoaClienteRequestDto) {
        Pessoa pessoa = new PessoaClienteRequestDto().converter(pessoaClienteRequestDto);
        pessoa.setDataCriacao(new Date());
        Pessoa pessoaNova = pessoaClienteRepositorio.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(pessoaNova);
        return pessoaNova;
    }

}
