package br.univille.brunobeckdacs2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.brunobeckdacs2021.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository <Fornecedor, Long>
{
    
}