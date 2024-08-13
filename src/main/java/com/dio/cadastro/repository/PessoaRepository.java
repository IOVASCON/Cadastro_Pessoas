package com.dio.cadastro.repository;

import com.dio.cadastro.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Aqui podemos adicionar métodos de pesquisa específicos, caso necessário
}
