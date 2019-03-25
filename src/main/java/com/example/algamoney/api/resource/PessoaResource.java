package com.example.algamoney.api.resource;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    private ResponseEntity<Pessoa> cadastrarPessoa(@Valid @RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaRepository.save(pessoa));
    }
}
