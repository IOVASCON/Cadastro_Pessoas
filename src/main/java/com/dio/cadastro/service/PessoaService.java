package com.dio.cadastro.service;

import com.dio.cadastro.model.Pessoa;
import com.dio.cadastro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPessoaPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    public void deletarPessoaPorId(Long id) {
        pessoaRepository.deleteById(id);
    }

    public Pessoa atualizarPessoa(Long id, Pessoa pessoaDetalhes) {
        Pessoa pessoa = pessoaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada com id: " + id));
        pessoa.setNome(pessoaDetalhes.getNome());
        pessoa.setSobrenome(pessoaDetalhes.getSobrenome());
        return pessoaRepository.save(pessoa);
    }
}
