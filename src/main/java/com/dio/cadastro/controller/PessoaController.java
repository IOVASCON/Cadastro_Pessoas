package com.dio.cadastro.controller;

import com.dio.cadastro.model.Pessoa;
import com.dio.cadastro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.salvarPessoa(pessoa);
    }

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarTodasPessoas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPessoaPorId(@PathVariable Long id) {
        return pessoaService.buscarPessoaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoaDetalhes) {
        try {
            Pessoa pessoaAtualizada = pessoaService.atualizarPessoa(id, pessoaDetalhes);
            return ResponseEntity.ok(pessoaAtualizada);
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id) {
        try {
            pessoaService.deletarPessoaPorId(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }
}
