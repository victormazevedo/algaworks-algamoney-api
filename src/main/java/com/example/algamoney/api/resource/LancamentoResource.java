package com.example.algamoney.api.resource;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.LancamentoRepository;
import com.example.algamoney.api.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private LancamentoService lancamentoService;

    @GetMapping
    public ResponseEntity<List<Lancamento>> buscarTodosOsLancamentos() {
        return ResponseEntity.ok(lancamentoService.buscarTodosOsLancamentos());
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Lancamento> buscarLancamento(@PathVariable Long codigo) {
        Lancamento resultado = lancamentoService.buscarLancamento(codigo);
        return resultado != null ? ResponseEntity.ok(resultado) : ResponseEntity.notFound().build();
    }
}
