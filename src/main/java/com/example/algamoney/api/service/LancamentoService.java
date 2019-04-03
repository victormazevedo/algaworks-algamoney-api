package com.example.algamoney.api.service;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public List<Lancamento> buscarTodosOsLancamentos() {
        return lancamentoRepository.findAll();
    }

    public Lancamento buscarLancamento(Long codigo) {
        return lancamentoRepository.findOne(codigo);
    }

    public Lancamento cadastrarLancamento(Lancamento lancamento) {
        return lancamentoRepository.save(lancamento);
    }
}
