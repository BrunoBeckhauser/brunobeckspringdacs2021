package br.univille.brunobeckdacs2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.brunobeckdacs2021.model.Produto;
import br.univille.brunobeckdacs2021.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController 
{   
    @Autowired
    private ProdutoService service;
    @GetMapping
    public ModelAndView index()
    {
        List<Produto> lista = service.getall();
        return new ModelAndView("produto/index", "listaProdutos", lista);

    }
    
}