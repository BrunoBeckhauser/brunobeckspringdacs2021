package br.univille.brunobeckdacs2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.brunobeckdacs2021.model.Produto;
import br.univille.brunobeckdacs2021.repository.ProdutoRepository;
import br.univille.brunobeckdacs2021.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService
{
    @Autowired
    private ProdutoRepository repository;
    @Override
    public List<Produto> getall() 
    {
        return repository.findAll();
    }
    
}