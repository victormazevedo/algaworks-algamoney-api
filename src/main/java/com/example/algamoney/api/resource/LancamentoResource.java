package com.example.algamoney.api.resource;

import com.example.algamoney.api.event.RecursoCriadoEvent;
import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.LancamentoRepository;
import com.example.algamoney.api.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @GetMapping
    public ResponseEntity<List<Lancamento>> buscarTodosOsLancamentos() {
        return ResponseEntity.ok(lancamentoService.buscarTodosOsLancamentos());
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Lancamento> buscarLancamento(@PathVariable Long codigo) {
        Lancamento resultado = lancamentoService.buscarLancamento(codigo);
        return resultado != null ? ResponseEntity.ok(resultado) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Lancamento> cadsatrarLancamento(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response) {
        Lancamento lancamentoSalvo = lancamentoService.cadastrarLancamento(lancamento);

        eventPublisher.publishEvent(new RecursoCriadoEvent(this, response, lancamentoSalvo.getCodigo()));
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
    }
}
