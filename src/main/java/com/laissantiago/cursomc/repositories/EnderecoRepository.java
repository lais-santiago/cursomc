package com.laissantiago.cursomc.repositories;

import com.laissantiago.cursomc.domain.Categoria;
import com.laissantiago.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco, Integer> {

}