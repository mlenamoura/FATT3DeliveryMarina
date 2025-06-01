package br.com.fat.delivery.service;
import br.com.fat.delivery.model.Produto;

import br.com.fat.delivery.repository.ProdutoRepository;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.service;
import java.util.List;


@Service
public class ProdutoService {
    private final ProdutoRepository repository;


    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

   public List<Produto> listarTodos(){
    return repository.findAll();

   }

   public Produto salvar(Produto produto){
return repository.save(produto);
}
