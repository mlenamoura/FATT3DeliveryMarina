package br.com.fat.delivery.repository;
import br.com.fat.delivery.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public class ProdutoRepository {
    List<Produto> findBNomeContaining(String nome);
}
