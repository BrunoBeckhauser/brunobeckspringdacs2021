package br.univille.brunobeckdacs2021.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.univille.brunobeckdacs2021.model.Categoria;

@Service
public interface CategoriaService 
{
    public List<Categoria> getAllCategorias();
    public Categoria save(Categoria categoria);
    public void delete(Categoria categoria);
}