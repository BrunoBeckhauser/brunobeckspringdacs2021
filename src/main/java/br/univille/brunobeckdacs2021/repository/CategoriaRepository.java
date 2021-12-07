package br.univille.brunobeckdacs2021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.brunobeckdacs2021.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>
{
    
}