package br.com.fat.delivery.controller;
import  br.com.fat.delivery.model.Produto;
import br.com.fat.delivery.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/produtos")

public class ProdutoController {
private final ProdutoService service;

public ProdutoController(ProdutoService service){
    this.service = service;
}
@GetMapping
public Produto criar(@RequestBody Produto produto){
    return service.salvar(produto);
}
}


